package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.Intern
import org.springframework.data.jpa.repository.JpaRepository

interface InternRepository : JpaRepository<Intern, Long>