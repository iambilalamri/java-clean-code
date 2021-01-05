package amrib.cleancode.exception;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException() {
		super("Insufficient funds in your account.");
	}

	public InsufficientFundsException(String message) {
		super(message);
	}
}
