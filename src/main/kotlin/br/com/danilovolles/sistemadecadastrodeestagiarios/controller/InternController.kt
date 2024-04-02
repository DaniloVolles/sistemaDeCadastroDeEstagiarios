package br.com.danilovolles.sistemadecadastrodeestagiarios.controller

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.Intern
import br.com.danilovolles.sistemadecadastrodeestagiarios.repository.InternRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.util.Optional

@RestController
@RequestMapping("/interns")
class InternController {

    @Autowired
    private lateinit var internRepository: InternRepository

    // POST
    @PostMapping("/")
    fun saveIntern(@RequestBody intern: Intern) = this.internRepository.save(intern)

    // GET All
    @GetMapping("/list")
    fun getAllInterns(): List<Intern> = internRepository.findAll()

    // GET by Id
    @GetMapping("/{id}")
    fun getInternById(@PathVariable("id") id: Long): Optional<Intern> = internRepository.findById(id)

    // DELETE by Id
    @DeleteMapping("/{id}")
    fun deleteInternById(@PathVariable("id") id: Long) = internRepository.deleteById(id)

}