package curs5;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		/**
		 * Intrebam utilizatorul ce nota a obtinut
		 * pe baza notei intoarcem un mesaj :
		 * nota A : Felicitari!
		 * nota B : Destul de bine!
		 * nota C : Suficient!
		 * nota D : Insuficient!
		 * daca introduce alta nota, printam te rog introdu o nota valida
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ce nota ai luat :");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A" :
			System.out.println("Felicitari!");
			break;
		case "B" :
			System.out.println("Destul de bine!");
			break;
		case "C" :
			System.out.println("Suficient!");
			break;
		case "D" :
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Te rog introdu o nota valida");
		}
	}
}