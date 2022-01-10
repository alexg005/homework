package curs6;

import java.util.HashSet;
import java.util.Set;

public class Homework3 {
	public static void main(String[] args) {
		
		String[] myStringArray = { "Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion" };
		Set<String> set = new HashSet<>();
		for (String name : myStringArray) {
			if (set.add(name) == false) {
				System.out.println("Nume duplicat: " + name);
			}
		}

	}
}
