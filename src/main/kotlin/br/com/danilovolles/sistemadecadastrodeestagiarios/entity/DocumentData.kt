package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.*
import org.jetbrains.annotations.NotNull

@Entity
data class DocumentData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @NotNull
        @OneToOne
        @JoinColumn(name = "employee_id")
        val employee: Employee? = null,

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