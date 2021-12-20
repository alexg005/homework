package curs5;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Homework1 hw1 = new Homework1();
		hw1.login();
		hw1.fibonacci1();
		hw1.fibonacci2();
	}

	private void login() {
		int incercari = 3;
		String user = "TestUser";
		int pass = 1234;
		Boolean successfulLogin = false;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Type in user: ");
			String inputUser = sc.next();
			System.out.println("Type in password: ");
			int inputPass = sc.nextInt();
			if (user.equals(inputUser) && pass == inputPass) {
				successfulLogin = true;
				System.out.println("Login successful!");
			} else {
				System.err.println("Login error");
			}
			incercari--;
		} while (incercari > 0 && !successfulLogin);

	}

	private void fibonacci1() {
		int[] numbersArray = new int[10];
		numbersArray[0] = 0;
		numbersArray[1] = 1;
		System.out.println(numbersArray[0]);
		System.out.println(numbersArray[1]);

		for (int i = 2; i <= numbersArray.length - 2; ++i) {
			numbersArray[i] = numbersArray[i - 1] + numbersArray[i - 2];
			System.out.println(numbersArray[i]);
		}
	}

	private void fibonacci2() {
		int[] numbersArray = new int[10];
		numbersArray[0] = 0;
		numbersArray[1] = 1;
		int i = 2;
		System.out.println(numbersArray[0]);
		System.out.println(numbersArray[1]);

		while (i <= numbersArray.length - 2) {
			numbersArray[i] = numbersArray[i - 1] + numbersArray[i - 2];
			System.out.println(numbersArray[i]);
			++i;
		}
	}
}
