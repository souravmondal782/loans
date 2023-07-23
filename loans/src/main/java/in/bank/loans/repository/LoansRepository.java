package in.bank.loans.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.bank.loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {

	Loans findByCustomerId(int customerID);
	
}
