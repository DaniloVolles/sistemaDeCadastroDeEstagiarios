package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity
data class Intern (

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        val nome: String,

        val admissionDate: Date,
        val maritalStatus: String,
        val nationality: String,
        val birthDate: Date,
        val birthPlace: String,
        val gender: String,
        val ethnicity: String,

        val cpf: String,
        val rg: String,
        val rgIssuer: String,
        val rgUf: String,
        val rgIssueDate: Date,
        val voterRegistration: String,
        val voterRegistrationZone: String,
        val voterRegistrationSection: String,
        val pis: String,

        val formationCourse: String,
        val formationCourseDateStart: Date,
        val formationCourseDateEnd: Date,
        val formationCourseInstitution: String,

        val bankName: String,
        val bankBranchNumber: String,
        val bankAccountNumber: String,
        val bankAccountType: String

)