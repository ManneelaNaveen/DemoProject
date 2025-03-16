package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Iterate {
	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		//		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Apple", 1);
		map.put("Dragon Fruit", 4);
		map.put("Banana", 2);
		map.put("Cherry", 3);

		// Iterating through the entrySet

		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			System.out.println("Keys:"+entry.getKey()+"Value:"+entry.getValue());

		}
	}
}


