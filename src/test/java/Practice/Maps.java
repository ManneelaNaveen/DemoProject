package Practice;

import java.util.HashMap;
import java.util.Map;

public class Maps {
public static void main(String[] args) {
	
	Map<Integer, String> map= new HashMap<Integer, String>();
	map.put(1080, "Naveen");
	map.put(1070, "java");
	map.put(null, null);
	map.put(1090, "James");
	map.put(1000, "James");
//	System.out.println(map.keySet());
//	System.out.println(map.values());
//	map.remove(1010);
//	System.out.println(map.get(1010));
	System.out.println(map.keySet());
	System.out.println(map.values());


}
}
