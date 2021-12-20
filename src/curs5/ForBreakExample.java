package curs5;

import java.util.Scanner;

public class ForBreakExample {

	public static void main(String[] args) {

		/**
		 * Luam un string si ca cautam o litera in stringul respectiv
		 * daca gasim litera iesim din program si printam ; am gasit litera
		 * daca nu o gasim printam ca nu am gasit litera
		 */
		
		System.out.println("Please enter a text :");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		char letter = 'A';
		//masina
		//012345
		//i==letter --> boolean true
		boolean letterFound = false;
		int counter = 0;
		
		for(int i =0; i<text.length();i++){
			char currentLetter = text.charAt(i);
			System.out.println(i);
			if(currentLetter == letter || currentLetter == 'a') {
				letterFound =  true;
				counter++;
			//	break;
			}
			
		}
		
		if(letterFound) {
			System.out.println("Litera A exista in text");
			System.out.println("Counter :" +counter);
		}else {
			System.out.println("Litera A nu exista in text");
		}
		
		
		
	}

}