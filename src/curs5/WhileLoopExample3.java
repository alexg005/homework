package curs5;

import java.util.Scanner;

public class WhileLoopExample3 {

	/**
	 * Facem un program care calculeaza salariul pe saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * dupa care calculam atata timp cat nr de ore nu este mai mare de 40 sau mai mic de 1
	 * daca nr de ore nu este valid il rugam sa introduca un numar valid de ore
	 * 
	 */
	
	public static void main(String[] args) {

	//ce stim
		int maxAllowedHoursWorked = 40;
		int ratePerHour = 15;
	//ce nu stim	
		System.out.println("Cate ore ai lucrat saptamana aceasta ? :");
		Scanner scan = new Scanner(System.in);
		int hoursWorked = scan.nextInt();
	//validarea	
		
		while(hoursWorked > maxAllowedHoursWorked || hoursWorked < 1) {			
			System.out.println("Numar invalid de ore!");
			System.out.println("Introdu un numar valid de ore care sa fie mai mic decat 40 :");
			hoursWorked = scan.nextInt();
		}
		
		System.out.println("Salariul de plata este :" + hoursWorked*ratePerHour);
		
		
		
	}

}