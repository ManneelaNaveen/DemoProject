package Practice;

public class ReplaceVowelswith_X {
	public static void main(String[] args) {
		String input="NAveenMannEElAAEiou";
		input=input.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (char currentCharacter : input.toCharArray()) {

			if(currentCharacter=='a' || currentCharacter=='e' || currentCharacter=='i' || currentCharacter=='o' || currentCharacter=='u' )
			{
				sb.append("x");
			}else
			{
				sb.append(currentCharacter);	
			}

		}
		System.out.println(sb.toString());
	}
}
