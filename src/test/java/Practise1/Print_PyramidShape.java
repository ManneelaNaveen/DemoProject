package Practise1;

import java.util.Scanner;

public class Print_PyramidShape {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input:");
		int rows=scanner.nextInt();
		for (int i = 1; i <= rows; i++) {
			
			// Print spaces
			
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			
			// Print stars
			
			for (int j = 1; j <= (2 * i-1); j++) {
				System.out.print("*");
			}
			
			// Move to the next line
			
			System.out.println(); 
		}	
	}
}
