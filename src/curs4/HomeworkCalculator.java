package curs4;

import java.util.Scanner;

public class HomeworkCalculator {
	private int[] numbers;
	
	public void askNumbers() {
		numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		int j = 1;
		for(int i = 0; i < 10; i++) {
		System.out.println("Please enter number " + j);
		numbers[i] = sc.nextInt();
		j++;
		}
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		System.out.println("The sum of the numbers is: " + sum);
	}
	
	public void multiplyTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in number:");
		int nr = sc.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.println(nr + " * " + i + " = " + nr * i);
		}
	}
}
