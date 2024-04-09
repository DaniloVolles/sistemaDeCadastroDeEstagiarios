package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.PersonalData
import org.springframework.data.jpa.repository.JpaRepository

interface PersonalDataRepository : JpaRepository<PersonalData, Long>