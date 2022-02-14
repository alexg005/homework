package curs11;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Map<String, Integer> catalog = new HashMap<>();
		catalog.put("Alex", 10);
		catalog.put("Catalin", 9);
		catalog.put("Cristi", 3);

		System.out.println("Introdu numele: ");
		Scanner sc = new Scanner(System.in);
		String numeCautat = sc.next();
		System.out.println("Introdu nota: ");
		int notaCurenta = sc.nextInt();
		sc.close();

		if (catalog.containsKey(numeCautat)) {
			int notaCatalog = catalog.get(numeCautat);
			if (notaCurenta > 10) {
				System.err.println("Clever, are we?!");
			} else if (notaCurenta > notaCatalog) {
				catalog.put(numeCautat, notaCurenta);
			} else {
				System.out.println("N-ai nevoie de alta nota");
			}
		} else {
			catalog.put(numeCautat, notaCurenta);
			System.out.println("Nu aveai nota, ti-am trecut acum");
		}

		for (Entry<String, Integer> entry : catalog.entrySet()) {
			System.out.println("_________________________");
			System.out.println(String.format("| Nume: %s | Nota: %s |", entry.getKey(), entry.getValue()));
		}
	}
}
