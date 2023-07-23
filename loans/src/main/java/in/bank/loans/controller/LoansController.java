package in.bank.loans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.bank.loans.model.Customers;
import in.bank.loans.model.Loans;
import in.bank.loans.repository.LoansRepository;

@RestController
public class LoansController {

	@Autowired
	private LoansRepository loansRepository;
	
	@PostMapping("/loans")
	public Loans getLoansDetails(@RequestBody Customers customer) {
		
		Loans loans = loansRepository. findByCustomerId(customer.getCustomerId());
		return loans;
	}
}
