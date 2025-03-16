package Practice;

public class Remove_RepeatedCharacters {
	public static void main(String[] args) {

		String str = "HelloManneela";
		StringBuilder sb = new StringBuilder();

		// iterate loop to store characters

		for(int i=0;i<str.length();i++)
		{
			// storing characters in 'ch' reference variable

			char ch = str.charAt(i);
			int index_Position = str.indexOf(ch, i+1);
			if(index_Position==-1)
			{
				sb.append(ch);
			}
		}	
		System.out.println(sb);

	}
}
