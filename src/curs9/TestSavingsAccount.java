package curs9;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {

		String name = "Alex";
		String location = "Bucharest";
		String email = "alex@example.com";

		SavingsAccount savingsAccount = new SavingsAccount("1", 100.0, new Customer(name, location, email));

		try {
			System.out.println(String.format("Hi, %s! %sPlease enter the ammount to withdraw", name, "\n"));
			Scanner scanner = new Scanner(System.in);
			double sum = scanner.nextDouble();
			if (sum > 0) {
				savingsAccount.withdraw(sum);
			} else {
				System.err.println("Amount should be greater than 0");
			}
			scanner.close();
		} catch (InsufficientFundsException e) {
			System.out
					.println("The amount you entered is greater than the available balance: " + savingsAccount.balance);
			System.out.println("Thank you for using our ATM");
			e.printStackTrace();
		}

	}

}
