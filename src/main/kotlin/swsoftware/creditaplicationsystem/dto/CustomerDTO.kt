package swsoftware.creditaplicationsystem.dto

import jakarta.persistence.*
import swsoftware.creditaplicationsystem.entity.Address
import swsoftware.creditaplicationsystem.entity.Credit
import swsoftware.creditaplicationsystem.entity.Customer
import java.math.BigDecimal

data class CustomerDTO(
		var firstName: String,
		var lastName: String,
		val cpf: String,
		var email: String,
		val income: BigDecimal,
		var password: String,
		var zipCode: String,
		var street: String,
		var credits: List<Credit> = mutableListOf(),
		val id: Long? = null) {

	fun toEntity(): Customer = Customer(
			firstName = this.firstName,
			lastName = this.lastName,
			cpf = this.cpf,
			income = this.income,
			email = this.email,
			password = this.password,
			address = Address(
					zipCode = this.zipCode,
					street = this.street
			)
	)
}
