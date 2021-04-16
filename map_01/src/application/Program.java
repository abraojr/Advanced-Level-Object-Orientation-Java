package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	// HasHMap-> fastest (O(1) operations in hash table) and unordered.
	// TreeMap-> slowest (O(log(n) operations) in red-black tree) and sorted by the object's compareTo (or Comparator).
	// LinkedHashMap-> intermediate speed and elements in the order they are added.

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();
		// Map<String, String> cookies = new HashMap<>();
		// Map<String, String> cookies = new LinkedHashMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");

		cookies.remove("email");
		cookies.put("phone", "99771133");

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // OUTPUT: true
		System.out.println("Phone number: " + cookies.get("phone")); // OUTPUT: 99771133
		System.out.println("Email: " + cookies.get("email")); // OUTPUT: null
		System.out.println("Size: " + cookies.size()); // OUTPUT: 2

		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}
}