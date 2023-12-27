package swsoftware.creditaplicationsystem.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import swsoftware.creditaplicationsystem.entity.Customer

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
}