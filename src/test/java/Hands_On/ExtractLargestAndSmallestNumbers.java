package Hands_On;

import java.util.Scanner;

public class ExtractLargestAndSmallestNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input from the console:-");
		int n=scanner.nextInt();

		// Enter array size elements

		int[] numbers = new int[n];

		System.out.println("Enter "+n+" "+"numbers:-");

		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=scanner.nextInt();

		}
		
		int largestNumber=numbers[0];
		int smallestNumber=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
		if(numbers[i]>largestNumber)
		{
			largestNumber=numbers[i];
		}
		if(numbers[i]<smallestNumber)
		{
			smallestNumber=numbers[i];
		}
		}
		System.out.println("Largest Number is :"+largestNumber);
		System.out.println("Smallest Number is :"+smallestNumber);


	}

}
