package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne

data class DocumentData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @OneToOne(mappedBy = "documentData")
        val intern: Intern? = null,

        val cpf: String,

        val rg: String,
        val rgIssuer: String,
        val rgUf: String,
        val rgIssueDate: String,

        val voterRegistration: String,
        val voterRegistrationZone: String,
        val voterRegistrationSection: String,

        val pis: String

)