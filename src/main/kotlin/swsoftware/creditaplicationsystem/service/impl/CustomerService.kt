package swsoftware.creditaplicationsystem.service.impl

import org.springframework.stereotype.Service
import swsoftware.creditaplicationsystem.entity.Customer
import swsoftware.creditaplicationsystem.repository.CustomerRepository
import swsoftware.creditaplicationsystem.service.ICustomerService
import java.lang.RuntimeException

@Service
class CustomerService(
		private val customerRepository: CustomerRepository
): ICustomerService {
	override fun save(customer: Customer): Customer =
		this.customerRepository.save(customer)


	override fun findById(id: Long): Customer = this.customerRepository.findById(id).orElseThrow {
		throw RuntimeException("Id $id not found")
	}

	override fun delete(id: Long) = this.customerRepository.deleteById(id)

}