package Practice;

import java.util.Arrays;

public class LargetNumber1 {
	public static void main(String[] args) {

		int[] numbers = {10, 45, 78, 90, 2, 67};

		int max = numbers[0]; // Assume first element is the largest

		// Largest number using For Loop


		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];

			}
		}
		System.out.println("Largest Number is using For Loop: "+max);

		// Largest number using ForEch Loop

		for (int num : numbers) {
			if (num > max) {
				max = num; // Update max if a larger number is found
			}
		}
		System.out.println("Largest Number is using forEach loop: "+max);
		
		// Largest number using arrays sort
		
		Arrays.sort(numbers);
		System.out.println("Larget Number Using Arrays Sort:"+numbers[numbers.length-1]);
		
		// Largest number using Steam API
		
		

	}
}