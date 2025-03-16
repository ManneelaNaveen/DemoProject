package Practice;

public class Convert_UpperToLower_LowerToUpper {
	public static void main(String[] args) {
		String input="Naveen Manneela1234";
		StringBuilder sb = new StringBuilder();
		char[] dataArray = input.toCharArray();
		for (char data : dataArray) {

			if(Character.isUpperCase(data))
			{
				sb.append(Character.toLowerCase(data));
			}
			else if(Character.isLowerCase(data))
			{
				sb.append(Character.toUpperCase(data));

			}
			else
			{
				sb.append(data);
			}
		}
		System.out.println("Original String: "+input);
		System.out.println("Convert Upper to Lowere and viceversa: "+sb.toString());

	}
}
