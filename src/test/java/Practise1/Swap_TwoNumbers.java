package Practise1;

public class Swap_TwoNumbers {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before swapping a:"+a);
		System.out.println("Before swapping b:"+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping a:"+a);
		System.out.println("After swapping b:"+b);
	}
}
