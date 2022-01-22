package curs9;

public class SavingsAccount extends Account {

	public SavingsAccount(String accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);

	}

	@Override
	public void withdraw(double sum) throws InsufficientFundsException {
		if (sum > balance) {
			throw new InsufficientFundsException("Insufficient funds");
		} else {
			super.balance -= sum;
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is: " + super.balance);
			System.out.println("Thank you for using our ATM");
		}

	}

}
