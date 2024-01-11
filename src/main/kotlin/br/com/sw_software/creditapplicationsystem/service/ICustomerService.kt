package br.com.sw_software.creditapplicationsystem.service

import br.com.sw_software.creditapplicationsystem.entity.Customer

interface ICustomerService {
  fun save(customer: Customer): Customer
  fun findById(id: Long): Customer
  fun delete(id: Long)
}