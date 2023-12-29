package swsoftware.creditaplicationsystem.service

import swsoftware.creditaplicationsystem.entity.Customer

interface ICustomerService {

	fun save(customer: Customer): Customer

	fun findById(id: Long): Customer

	fun delete(id: Long)

}