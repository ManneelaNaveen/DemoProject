package Practice;

public class PrintUpperandLowerCaseCount {
	public static void main(String[] args) {
		String str="NaveenManneela";
		int upper =0;
		int lower=0;

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}

		System.out.println("Upper characters count: "+upper);
		System.out.println("Lower characters count: "+lower);

	}
}
