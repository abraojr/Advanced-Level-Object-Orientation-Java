package application;

import model.entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");

		String s1 = "Test";
		String s2 = "Test";

		System.out.println(c1.hashCode()); //OUTPUT:-602288624
		System.out.println(c2.hashCode()); //OUTPUT:-602288624
		System.out.println(c1.equals(c2)); //OUTPUT: true
		System.out.println(c1 == c2); //OUTPUT: false
		System.out.println(s1 == s2); //OUTPUT: true
	}
}