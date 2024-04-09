package br.com.danilovolles.sistemadecadastrodeestagiarios.controller

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.PersonalData
import br.com.danilovolles.sistemadecadastrodeestagiarios.repository.PersonalDataRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/personalData")
class PersonalDataController {

    @Autowired
    private lateinit var personalDataRepository: PersonalDataRepository

    @PostMapping("/")
    fun postPersonalData(@RequestBody personalData: PersonalData) = this.personalDataRepository.save(personalData)



}