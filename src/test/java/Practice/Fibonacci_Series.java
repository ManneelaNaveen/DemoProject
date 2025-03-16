package Practice;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {

		// Create a scanner Object to read the data

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		// Variable to store the first two Numbers

		int firstNum=0, secondNum=1;
		System.out.println("Fibonacci Series of "+n+" Numbers:");

		// loop to generate fibbonacci series

		for(int i=1;i<=n;i++)
		{
			System.out.println(firstNum+"  ");

			// compute to next Number
			
			int nextNum= firstNum+secondNum;
			
			// update the values of next iteration
			
			firstNum=secondNum;
			secondNum=nextNum;

		}
		
	}
}
