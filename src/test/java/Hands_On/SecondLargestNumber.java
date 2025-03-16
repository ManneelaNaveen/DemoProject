package Hands_On;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("take input from the user:");
		int n=scanner.nextInt();
		int[] numbers = new int[n];
		System.out.println("Enter "+n+" "+"numbers");      
		for(int i=0;i<n;i++)
		{
			numbers[i]=scanner.nextInt();
		}

		int largestNumber=numbers[0];
		int smallestNumber=numbers[0];
		
		for(int i=0;i<n;i++)
		{
			if(largestNumber>numbers[i])
			{
				largestNumber=numbers[i];
			}
			if(smallestNumber<numbers[i])
			{
				smallestNumber=numbers[i];
			}
		}
		
		System.out.println("Largest Number :"+largestNumber);
		System.out.println("Smallest Number :"+smallestNumber);


	}
}
