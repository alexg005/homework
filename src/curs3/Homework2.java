package curs3;

import java.util.Scanner;

public class Homework2 {
	String age;
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Ce varsta ai?");
			int age = sc.nextInt();
			Homework2 hw = new Homework2();
			hw.ageCalculations(age);
		}
	}
	
	private void ageCalculations(int age) {
		if (age < 18) {
			System.out.println("Esti minor, no beer for you!");
		} else if (age >= 18 && age < 65 ) {
			System.out.println("Esti adult!");
		} else {
			System.out.println("Esti batran, no beer for you!");
		}
	}

}
