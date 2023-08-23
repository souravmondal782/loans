DROP TABLE IF EXISTS LOANS;
DROP TABLE IF EXISTS CUSTOMER;

CREATE TABLE CUSTOMER (
  customer_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  mobile_number VARCHAR(13) NOT NULL,
  email_id VARCHAR(100) NOT NULL,
  created_date DATE DEFAULT NULL
);

CREATE TABLE LOANS (
  customer_id INT NOT NULL,
  loan_number INT AUTO_INCREMENT PRIMARY KEY,
  loan_type VARCHAR(50) NOT NULL,
  loan_amount INT NOT NULL,
  loan_end_date DATE DEFAULT CURDATE() + 1 DAY
);



INSERT INTO CUSTOMER (customer_id, name, mobile_number, email_id, created_date)
VALUES ('1', 'sourav', '9876543210', 'sourav@test.com', CURDATE());





INSERT INTO LOANS ( loan_number, loan_type, loan_amount, loan_end_date)
VALUES ( '1', 'HOUSING LOAN', '10000', CURDATE()+1000);

INSERT INTO LOANS ( loan_number, loan_type, loan_amount, loan_end_date)
VALUES ( '2', 'VEHICLE LOAN', '50000', CURDATE()+100);

INSERT INTO LOANS ( loan_number, loan_type, loan_amount, loan_end_date)
VALUES ( '3', 'HOUSING LOAN', '80000', CURDATE()+5000);

INSERT INTO LOANS ( loan_number, loan_type, loan_amount, loan_end_date)
VALUES ( '4', 'PERSONAL LOAN', '7000', CURDATE()+10);
