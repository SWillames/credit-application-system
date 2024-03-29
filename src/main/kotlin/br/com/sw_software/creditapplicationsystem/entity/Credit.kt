package br.com.sw_software.creditapplicationsystem.entity

import br.com.sw_software.creditapplicationsystem.enummeration.Status
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

@Entity
data class Credit (
  @Column(nullable = false, unique = true)
  val creditCode: UUID = UUID.randomUUID(),
  @Column(nullable = false)
  val creditValue: BigDecimal = BigDecimal.ZERO,
  @Column(nullable = false)
  val firstIntallment: LocalDate,
  @Column(nullable = false)
  val numberOfInstallments: Int = 0,
  @Enumerated
  val status: Status = Status.IN_PROGRESS,
  @ManyToOne
  var customer: Customer? = null,
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null
)
