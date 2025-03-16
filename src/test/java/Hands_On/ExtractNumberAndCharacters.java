package Hands_On;

import java.util.Scanner;

public class ExtractNumberAndCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take input from the user

		System.out.println("Take input from the user:- ");

		String input=scanner.nextLine();


		// Variable to store numbers and characters

		StringBuilder numbers = new StringBuilder();
		StringBuffer characters = new StringBuffer();

		// iterate loop to check numbers and characters

		for (char ch : input.toCharArray()) {

			if(Character.isDigit(ch)) {
				numbers.append(ch);
			}
			else
			{
				characters.append(ch);
			}

		}

		System.out.println("Extracted Numbers from Given String:- "+numbers);
		System.out.println("Extracted Characters from Given String:- "+characters);	
	}
}
