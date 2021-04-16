package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Product;

public class Program {

	/*Make a program that, from a list of products, removes from the list only
	 * those whose minimum price is 100.*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		list.removeIf(Product::nonStaticProductPredicate);

		for (Product p : list) {
			System.out.println(p);
		}
	}
}