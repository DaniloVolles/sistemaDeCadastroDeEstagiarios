package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne

data class AcademicData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @OneToOne(mappedBy = "academicData")
        val employee: Employee? = null,

        val formationCourse: String,
        val formationCourseDateStart: String,
        val formationCourseDateEnd: String,
        val formationCourseInstitution: String,
)