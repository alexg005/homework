package curs9;

public abstract class Account {

	private String accountNumber;
	public double balance;
	Customer accountOwner;

	public Account(String accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}

	public abstract void withdraw(double sum) throws InsufficientFundsException;

}
