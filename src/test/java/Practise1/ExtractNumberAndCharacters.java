package Practise1;

import java.util.Scanner;

public class ExtractNumberAndCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input from the Console:");
		String input=scanner.nextLine();

		// store vowels and consonants in reference variable

		StringBuilder Numbers = new StringBuilder();
		StringBuilder characters = new StringBuilder();

		for (char ch : input.toCharArray()) {


			if(Character.isLetter(ch))
			{
				characters.append(ch);
			}if(Character.isDigit(ch))
			{
				Numbers.append(ch);

			}

		}
		
		System.out.println("Numbers are:-"+Numbers);
		System.out.println("Characters are:-"+characters);

	}
}
