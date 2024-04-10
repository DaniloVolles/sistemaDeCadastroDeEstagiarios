package br.com.danilovolles.sistemadecadastrodeestagiarios.controller

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.Employee
import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.PersonalData
import br.com.danilovolles.sistemadecadastrodeestagiarios.repository.EmployeeRepository
import br.com.danilovolles.sistemadecadastrodeestagiarios.repository.PersonalDataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView
import java.util.*

@RestController
@RequestMapping("/personalData")
class PersonalDataController {

    @Autowired
    private lateinit var employee: EmployeeRepository

    @Autowired
    private lateinit var employeeRepository: EmployeeRepository

    @Autowired
    private lateinit var personalDataRepository: PersonalDataRepository

//    @PostMapping("/{employee_id}")
//    fun postPersonalData(@RequestBody personalData: PersonalData, @PathVariable("employee_id") employeeId: Long): PersonalData {
//        val employee: Optional<Employee> = employeeRepository.findById(employeeId)
//        personalData.employee =
//
//    }

    @PostMapping("/{employee_id}")
    fun postPersonalData(@RequestBody personalData: PersonalData, @PathVariable("employee_id") employeeId: Long): PersonalData {
        // Buscar o Employee pelo ID
        val optionalEmployee: Optional<Employee> = employeeRepository.findById(employeeId)
        if (optionalEmployee.isPresent) {
            val employee: Employee = optionalEmployee.get()

            // Vincular a PersonalData ao Employee
            personalData.employee = employee

            // Salvar a PersonalData atualizada
            return personalDataRepository.save(personalData)
        } else {
            // Se o Employee com o ID fornecido não existir, lançar uma exceção ou tratar de acordo com a sua lógica de negócios
            throw RuntimeException("Employee com o ID $employeeId não encontrado")
        }
    }

    @GetMapping("/")
    fun getAllPersonalData(): List<PersonalData> = this.personalDataRepository.findAll()

    @DeleteMapping("/")
    fun deleteAllPersonalData() = personalDataRepository.deleteAll()

}