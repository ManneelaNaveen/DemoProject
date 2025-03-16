package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveRepeatedNumbers {
	public static void main(String[] args) {

		ArrayList<Integer> arralist = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,44,4,4,44,5));
		System.out.println("List with duplicates"+arralist);

		// convert array list to set

		HashSet<Integer> hashset = new HashSet<>();
		hashset.addAll(arralist);
		hashset.addAll(hashset);
		System.out.println("List Without Dulicates"+hashset);


	}
}
