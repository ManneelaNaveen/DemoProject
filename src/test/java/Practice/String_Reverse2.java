package Practice;

public class String_Reverse2 {
	public static void main(String[] args) {

		String Name = "Naveen Manneela";
		String ReverseName = new StringBuilder(Name).reverse().toString();
		System.out.println("Reverse of the String is: "+ReverseName);
	}

}
