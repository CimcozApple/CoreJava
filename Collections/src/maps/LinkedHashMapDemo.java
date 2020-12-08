package maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//ctrl shift o to remove unused imports
//Linked Hash map adds keys in order you use the put() method, hash map doesnt
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		//add elements into the hashmap
		//Key, Value
		map.put("Gil", 75);
		map.put("Mike", 100);
		map.put("Lala", 99);
		map.put("Joni", 20);
		//keys are unique
		Set<String> keySet = map.keySet();
		System.out.println("Keys: "+ keySet); 
		
		Collection<Integer> values = map.values();
		System.out.println("Values: "+ values);
		
		for(String key: keySet){
			System.out.println("Key: "+ key+" || Value: "+ map.get(key));
		}
		System.out.println(map.containsKey("Lala"));
		System.out.println(map.containsKey("lolol"));	
		System.out.println(map.containsValue(20));
		System.out.println(map.containsValue(21));
		
	}
}
