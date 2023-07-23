package in.bank.loans.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter @Setter @ToString
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//(AUTO_INCRMENT PRIMARY_KEY)
	@Column(name="customer_id")
	private int CustomerId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
}
