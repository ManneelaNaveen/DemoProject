package Hands_On;

import java.util.Scanner;

public class Print_NumberAndCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// take input from the user
		
		System.out.println("Enter input from the console:");
		String input=scanner.nextLine();
		
		// store numbers and characters
		
		StringBuilder numbers=new StringBuilder();
		StringBuilder characters = new StringBuilder();
		
//		for (char ch : input.toCharArray()) {
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(Character.isDigit(ch))
			{
				numbers.append(ch);
			}
			else
			{
				characters.append(ch);
			}
			
		}
		
		System.out.println("Numbers are:"+numbers);
		System.out.println("Characters are:"+characters);

	}
}
