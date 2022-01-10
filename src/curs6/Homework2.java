package curs6;

public class Homework2 {

	public static void main(String[] args) {

		String str = "Eu invat Java";
		String[] vowels = { "a", "e", "i", "o", "u" };
		int vowel = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (str.toLowerCase().charAt(i) == vowels[j].charAt(0)) {
					vowel++;
				}
			}
		}
		System.out.println("Vocale: " + vowel);
	}

}
