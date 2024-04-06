package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface InternRepository : JpaRepository<Employee, Long>