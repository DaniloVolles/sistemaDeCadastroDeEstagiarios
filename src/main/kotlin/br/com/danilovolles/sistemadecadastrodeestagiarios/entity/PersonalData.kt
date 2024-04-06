package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne

data class PersonalData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @OneToOne(mappedBy = "personalData")
        val employee: Employee? = null,

        val name: String,
        val maritalStatus: String,
        val nationality: String,
        val birthDate: String,
        val birthPlace: String,
        val gender: String,
        val ethnicity: String,
)
