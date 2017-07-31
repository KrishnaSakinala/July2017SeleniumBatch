package Day4.com.automationtesting.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String, String>();
		
		hm.put("Name", "Krishna");
		hm.put("location", "India");
		hm.put("teaching", "selenium");

		System.out.println(hm);
		
		System.out.println(hm.get("teaching"));
		
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		HashMap<String,String> hm1 = new HashMap<String, String>();
		System.out.println(hm1.isEmpty());
		
		hm.remove("location");
		System.out.println(hm);
	}

}
