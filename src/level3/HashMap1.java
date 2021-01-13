package level3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap<String, String> hash = new HashMap<String, String>();

		hash.put("Name", "Mary");
		hash.put("Surname", "Jane");
		hash.put("Age", "25");

		System.out.println(hash.get("Name"));
		System.out.println("---------");

		// 1st Way

		Iterator<String> iterator = hash.keySet().iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " : " + hash.get(key));
		}
		System.out.println("---------");

		// 2nd Way

		for (Entry<String, String> entry : hash.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}

}
