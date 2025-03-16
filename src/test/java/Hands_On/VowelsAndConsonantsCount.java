package Hands_On;

import java.util.Scanner;

public class VowelsAndConsonantsCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a input string:");
		String input=scanner.nextLine().toLowerCase();

		int vowelsCount=0;
		int consonantCount=0;
		StringBuilder vowels= new StringBuilder();
		StringBuilder consonants= new StringBuilder();

		for (char ch : input.toCharArray()) {

			if(Character.isLetter(ch))
			{
				if("aeiou".indexOf(ch)!=-1)
				{
					vowels.append(ch).append("");					
					vowelsCount++;
				}
				else

					consonants.append(ch).append("");					
				consonantCount++;
			}
		}
		System.out.println("Number of Vowels :"+vowels);
		System.out.println("Number of Consonants :"+consonants);
		System.out.println("Vowels Count is :"+vowelsCount);
		System.out.println("Consonant Count is :"+consonantCount);

	}
}
