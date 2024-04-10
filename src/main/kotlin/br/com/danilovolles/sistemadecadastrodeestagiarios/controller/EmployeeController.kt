package br.com.danilovolles.sistemadecadastrodeestagiarios.controller

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.Employee
import br.com.danilovolles.sistemadecadastrodeestagiarios.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional

@RestController
@RequestMapping("/employee")
class EmployeeController {

    @Autowired
    private lateinit var employeeRepository: EmployeeRepository

    // POST
    @PostMapping("/")
    fun saveEmployee(@RequestBody employee: Employee) = this.employeeRepository.save(employee)

    // GET All
    @GetMapping("/list")
    fun getAllInterns(): List<Employee> = employeeRepository.findAll()

    // GET by Id
    @GetMapping("/{id}")
    fun getInternById(@PathVariable("id") id: Long): Optional<Employee> = employeeRepository.findById(id)

    // DELETE by Id
    @DeleteMapping("/{id}")
    fun deleteInternById(@PathVariable("id") id: Long) = employeeRepository.deleteById(id)

    @DeleteMapping("/")
    fun deleteAllInterns() = employeeRepository.deleteAll()

}