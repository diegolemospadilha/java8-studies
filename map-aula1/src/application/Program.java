package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
	
	public static void main(String[] args) {
		
		// TreeMap = order by key
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Ronald");
		cookies.put("email", "ronald@email.com");
		cookies.put("phone", "111111111");
		cookies.put("phone", "222222222"); // overwrites first value
		
		System.out.println("My map contains 'email' key : " + cookies.containsKey("email"));
		for (String key: cookies.keySet()) {
			System.out.println("key " + key + ":" + cookies.get(key));
		}
	}
}
