package Practise1;

public class ReverseOfIntegers {
	public static void main(String[] args) {
		int number=123456789;
		int reverseNum=0;
		int lastDigit;
		while(number!=0)
		{
			lastDigit=number%10;

			// check for overflow

			if (reverseNum > Integer.MAX_VALUE / 10 || 
					(reverseNum == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
				System.out.println(0);
				System.exit(0);
			}

			if (reverseNum < Integer.MIN_VALUE / 10 || 
					(reverseNum == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
				System.out.println(0);
				System.exit(0);
			}

			reverseNum=reverseNum*10+lastDigit;
			number=number/10;
		}
		System.out.println(reverseNum);
	}
}
