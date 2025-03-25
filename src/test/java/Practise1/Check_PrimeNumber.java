package Practise1;

import java.util.Scanner;

public class Check_PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();

		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

	// Method to check if a number is prime
	public static boolean isPrime(int num) {
		if (num < 2) return false; // Numbers less than 2 are not prime
		for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to √num
			if (num % i == 0) {
				return false; // If divisible by i, not prime
			}
		}
		return true; // Otherwise, it's prime
	}
}
