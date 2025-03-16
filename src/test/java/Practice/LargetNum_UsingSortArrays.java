package Practice;

import java.util.Arrays;

public class LargetNum_UsingSortArrays {
	public static void main(String[] args) {

		int[] numbers = {101,2011,40,80,100};
		Arrays.sort(numbers);
		System.out.println("Larget Number is :"+numbers[numbers.length-1]);
	}
}
