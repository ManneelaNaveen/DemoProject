package Practice;

public class StringRev1 {
	public static void main(String[] args) {

		String a="Dad";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}

		System.out.println(b);
		if(a.equalsIgnoreCase(b))
		{
			System.out.println(a+" is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}
}

