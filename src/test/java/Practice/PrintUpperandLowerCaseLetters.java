package Practice;

public class PrintUpperandLowerCaseLetters {
	public static void main(String[] args) {

		String str="NaveenManneela";

		String Upper ="";
		String Lower="";

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper=Upper+ch;
			}
			else
			{
				Lower=Lower+ch;
			}
		}

		System.out.println("lower characters are: "+Lower);
		System.out.println("Upper characters are: "+Upper);

	}
}
