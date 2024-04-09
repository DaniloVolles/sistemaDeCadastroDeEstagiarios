package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.AcademicData
import org.springframework.data.jpa.repository.JpaRepository

interface AcademicData : JpaRepository<AcademicData, Long>