package br.com.danilovolles.sistemadecadastrodeestagiarios.entity

import jakarta.persistence.*
import org.jetbrains.annotations.NotNull

@Entity
data class BankData(

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @NotNull
    @OneToOne
    @JoinColumn(name = "employee_id")
    val employee: Employee? = null,

    val bankName: String,
    val bankBranchNumber: String,
    val bankAccountNumber: String,
    val bankAccountType: String

)
