package swsoftware.creditaplicationsystem.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import swsoftware.creditaplicationsystem.dto.CustomerDTO
import swsoftware.creditaplicationsystem.service.impl.CustomerService

@RestController
@RequestMapping("/api/customers")
class CustomerController(
		private val customerService: CustomerService
) {

	@PostMapping
	fun saveCustomer(@RequestBody customerDTO: CustomerDTO): String{
		val savedCustomer = this.customerService.save(customerDTO.toEntity())
		return "Customer ${savedCustomer.email} saved!"
	}
}