package application;

import java.util.HashSet;
import java.util.Set;

public class Program {
	
	//HasHSet-> fastest (O(1) operations in hash table) and unordered.
	//TreeSet-> slowest (O(log(n) operations) in red-black tree) and sorted by the object's compareTo (or Comparator).
	//LinkedHashSet-> intermediate speed and elements in the order they are added.
	
	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		// Set<String> set = new TreeSet<>();
		// Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook")); // OUTPUT:true
		for (String p : set) {
			System.out.println(p);
		}
	}
}