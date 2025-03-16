package Practice;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// take input from the user

		System.out.println("Enter the numbers :");
		int n=scanner.nextInt();

		// validate the input size

		if(n<2)
		{
			System.out.println("At least two numbers are required: ");
			return;
		}

		int numbers[] = new int[n];

		// input array elements

		System.out.println("Eneter "+n+" "+"numbers:");
		for(int i=0;i<n;i++)
		{
			numbers[i]=scanner.nextInt();
		}


		// Initialize largest and second largest

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Find the largest and second largest

		for (int num : numbers) {
			if (num > largest) {
				secondLargest = largest;
				largest = num;
			} else if (num > secondLargest && num != largest) {
				secondLargest = num;
			}
		}

		// Print result

		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No second largest element found.");
		} else {
			System.out.println("Second largest number: " + secondLargest);
		}

		scanner.close();
	}

}

