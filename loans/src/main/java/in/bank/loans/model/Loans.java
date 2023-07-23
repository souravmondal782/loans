package in.bank.loans.model;

//import java.sql.Date;
import java.time.LocalDate;


/*import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/
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
public class Loans {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//(AUTO_INCRMENT PRIMARY_KEY)
	@Column(name = "loan_number")
	private int loanNumber; 
	
	@Column(name = "customer_id")
	private int customerId;

	 @Column(name = "loan_type")
	private String loanType;
	
	@Column(name = "loan_amount ")
	private int loanAmt;
	
	@Column(name = "loan_end_date ")
	private LocalDate loanEndDate;

}
