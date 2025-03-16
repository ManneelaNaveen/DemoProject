package Practice;

public class FirstAndSecondLargest {

	public static void main(String[] args) {

		int a = 10;
		int b = 204;
		int c = 30;

		int largest, secondLargest;

		// Finding the largest number
		if (a > b && a > c) {
			largest = a;
			secondLargest = Math.max(b, c);
		} else if (b > a && b > c) {
			largest = b;
			secondLargest = Math.max(a, c);
		} else {
			largest = c;
			secondLargest = Math.max(a, b);
		}

		// Printing the results
		System.out.println("Largest number: " + largest);
		System.out.println("Second largest number: " + secondLargest);
	}
}
