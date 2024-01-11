package br.com.sw_software.creditapplicationsystem.service

import br.com.sw_software.creditapplicationsystem.entity.Credit
import java.util.UUID

interface ICreditService {

  fun save(credit: Credit): Credit
  fun findAllByCustomer(customerId: Long): List<Credit>
  fun findByCreditCode(customerId: Long, crediCode: UUID): Credit
}