package swsoftware.creditaplicationsystem.service.impl

import org.springframework.stereotype.Service
import swsoftware.creditaplicationsystem.entity.Credit
import swsoftware.creditaplicationsystem.repository.CreditRepository
import swsoftware.creditaplicationsystem.service.ICreditService
import java.util.*

@Service
class CreditService(
		private val creditRepository: CreditRepository,
		private val customerService: CustomerService
): ICreditService {
	override fun save(credit: Credit): Credit {
		credit.apply {
			customer = customerService.findById(credit.customer?.id!!)
		}
		return this.creditRepository.save(credit)
	}

	override fun findAllByCustomer(customerId: Long): List<Credit> =
			this.creditRepository.findAllByCustomerId(customerId)

	override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
		val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
				?: throw RuntimeException("CreditCode $creditCode not found"))
		return if (credit.customer?.id == customerId) credit else throw RuntimeException("Contact Admin")
	}
}