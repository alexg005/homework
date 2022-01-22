package curs9;

public class InsufficientFundsException extends Exception {
	/**
	 * Insufficient funds
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String error) {
		System.err.println(error);
	}
}
