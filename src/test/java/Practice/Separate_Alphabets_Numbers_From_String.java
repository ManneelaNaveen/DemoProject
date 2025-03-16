package Practice;

public class Separate_Alphabets_Numbers_From_String {

	public static void main(String[] args) {

		String input="Hello1243QA";
		StringBuilder alphabets=new StringBuilder();
		StringBuilder numbers = new StringBuilder();

		for (char currentCharacter : input.toCharArray()) {
			if(Character.isAlphabetic(currentCharacter))
			{
				alphabets.append(currentCharacter);
			}
			else if(Character.isDigit(currentCharacter))
			{
				numbers.append(currentCharacter);
			}
		}
		System.out.println(alphabets.toString());
		System.out.println(numbers.toString());
	}

}
