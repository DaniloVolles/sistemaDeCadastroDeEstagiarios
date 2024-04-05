package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne

data class BankData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @OneToOne(mappedBy = "bankData")
        val intern: Intern? = null,

        val bankName: String,
        val bankBranchNumber: String,
        val bankAccountNumber: String,
        val bankAccountType: String

)
