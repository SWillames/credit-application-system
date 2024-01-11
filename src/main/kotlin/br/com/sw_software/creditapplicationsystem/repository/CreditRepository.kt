package br.com.sw_software.creditapplicationsystem.repository

import br.com.sw_software.creditapplicationsystem.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CreditRepository: JpaRepository<Credit, Long> {
  fun findByCreditCode(crediCode: UUID): Credit?
  @Query(value = "SELECT * FROM CREDIT WHERE CREDIT_ID = ?1", nativeQuery = true)
  fun findAllByCustomerId(customerId: Long): List<Credit>
}