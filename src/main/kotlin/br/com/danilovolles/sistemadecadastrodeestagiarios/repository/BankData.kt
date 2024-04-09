package br.com.danilovolles.sistemadecadastrodeestagiarios.repository

import br.com.danilovolles.sistemadecadastrodeestagiarios.entity.BankData
import org.springframework.data.jpa.repository.JpaRepository

interface BankData : JpaRepository<BankData, Long>