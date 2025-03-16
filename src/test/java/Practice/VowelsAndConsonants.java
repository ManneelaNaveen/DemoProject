package Practice;

import java.util.Scanner;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Get input from user

		System.out.print("Enter a string: ");
		String input = scanner.nextLine().toLowerCase();



		// Initialize vowel and consonant strings

		StringBuilder vowels = new StringBuilder();
		StringBuilder consonants = new StringBuilder();

		// Iterate through each character

		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {   // Check if it's a letter
				if (isVowel(ch)) {
					vowels.append(ch).append(" ");
				} else {
					consonants.append(ch).append(" ");
				}
			}
		}

		// Print vowels and consonants

		System.out.println("Vowels: " + vowels.toString());
		System.out.println("Consonants: " + consonants.toString());

		scanner.close();
	}

	// Method to check if a character is a vowel

	public static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}
}
