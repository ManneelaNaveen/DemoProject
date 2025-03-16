package Hands_On;

import java.util.Scanner;

public class PrintVowelsAndConsonants {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take input from the user

		System.out.println("Enter input string:");
		String input=scanner.nextLine();


		// Store Vowels & Consonants

		StringBuilder vowels= new StringBuilder();
		StringBuilder consonants = new StringBuilder();

		// convert to lower case for easy comparison.

		String lowercaseInput=input.toLowerCase();

		// loop through each character

		for(int i=0;i<lowercaseInput.length();i++)
		{
			char ch= lowercaseInput.charAt(i);

			// check if it's a letter.

			if(Character.isLetter(ch))
			{

				//  check if it's a vowel

				if("aeiou".indexOf(ch)!=-1)
				{
					vowels.append(ch).append("");

				}
				else
				{
					consonants.append(ch).append("");
				}

			}

		}

		// Output the results

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		scanner.close();

	}
}
