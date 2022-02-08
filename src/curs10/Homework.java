package curs10;


import java.io.IOException;
import java.util.Scanner;


public class Homework {

	public static void main(String[] args) throws IOException {
		
		PropertiesCheck prop = new PropertiesCheck();

		boolean found = false;
		String leguma = "";
		Scanner sc = new Scanner(System.in);
		while(!found) {
			System.out.println("Ce leguma ai vrea sa cumperi?");
			leguma = sc.next();
			found = prop.readFile(leguma);
		}
	}
	
	

}
