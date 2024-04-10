package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne

@Entity
data class Employee (

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val admissionDate: String,
        val name: String,

        @OneToOne(mappedBy = "employee")
        val personalData: PersonalData? = null,

        @OneToOne(mappedBy = "employee")
        val documentData: DocumentData? = null,

        @OneToOne(mappedBy = "employee")
        val bankData: BankData? = null,

        @OneToOne(mappedBy = "employee")
        val academicData: AcademicData? = null
)