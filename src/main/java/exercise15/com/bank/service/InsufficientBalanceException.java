package exercise15.com.bank.service;

public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super();
		
	}

	public InsufficientBalanceException(String message) {
		super(message);
		
	}

	
}
