package swsoftware.creditaplicationsystem.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import swsoftware.creditaplicationsystem.entity.Credit

@Repository
interface CreditRepository: JpaRepository<Credit, Long> {
}