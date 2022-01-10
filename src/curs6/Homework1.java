package curs6;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		int numbers[] = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Type in number " + (i + 1));
			numbers[i] = sc.nextInt();
		}
		for (int number : numbers) {
			sum += number;
		}

		System.out.println("Sum of numbers is: " + sum);
	}
}
