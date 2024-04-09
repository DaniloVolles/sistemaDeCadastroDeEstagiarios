package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.*
import org.jetbrains.annotations.NotNull

@Entity
data class PersonalData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @NotNull
        @OneToOne
        @JoinColumn(name = "employee_id")
        val employee: Employee? = null,

        val name: String,
        val maritalStatus: String,
        val nationality: String,
        val birthDate: String,
        val birthPlace: String,
        val gender: String,
        val ethnicity: String,
)
