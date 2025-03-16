package Hands_On;

import java.util.Scanner;

public class LargestAndSmallestNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

		// take input from the user

		System.out.println("Take input from the user:-");

		// take array size input from the user

		int n = scanner.nextInt();

		// enter input array elements

		int[] numbers= new int[n];
		
		System.out.println("Enter "+n+ " numbers");

		for(int i=0;i<n;i++)
		{
			numbers[i]=scanner.nextInt();
		}

		int largestNumber=numbers[0];
		int smallestNumber=numbers[0];
		
		for(int i=0;i<n;i++)
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
		
		System.out.println("Larget Number is:"+largestNumber);
		System.out.println("Smallest Number is:"+smallestNumber);

	}
}
