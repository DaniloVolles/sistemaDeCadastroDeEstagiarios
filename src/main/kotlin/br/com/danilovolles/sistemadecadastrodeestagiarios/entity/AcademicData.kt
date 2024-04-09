package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import org.jetbrains.annotations.NotNull

@Entity
data class AcademicData(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "academic_data_id")
        val id: Long,

        @NotNull
        @OneToOne
        @JoinColumn(name = "employee_id")
        val employee: Employee? = null,

        val formationCourse: String,
        val formationCourseDateStart: String,
        val formationCourseDateEnd: String,
        val formationCourseInstitution: String,
)