package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.DocumentData
import org.springframework.data.jpa.repository.JpaRepository

interface DocumentData : JpaRepository<DocumentData, Long>