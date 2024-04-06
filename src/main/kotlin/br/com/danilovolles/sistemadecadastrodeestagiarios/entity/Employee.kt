package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Employee (

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val admissionDate: String,

)