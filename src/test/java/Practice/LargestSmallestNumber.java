package Practice;
import java.util.Scanner;

public class LargestSmallestNumber {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		// take input from the user

		System.out.println("Enter the number of elements :");

		int n= scanner.nextInt();

		// taking input for array size

		int[] numbers = new int[n];  

		// taking input for array elements

		System.out.println("Enter "+n+" "+"numbers:");

		for(int i=0;i<n;i++)
		{
			numbers[i]=scanner.nextInt();
		}



		// declare smallest & large number

		int larget = numbers[0];
		int smallest=numbers[0];

		// loop through find largest and smallest numbers

		for(int i=0;i<n;i++)
		{
			if(numbers[i]>larget)
			{
				larget=numbers[i];
			}
			if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}

		}
		
		System.out.println("Largest Number is: "+larget);
		System.out.println("Smallest Number is: "+smallest);

	}

}

