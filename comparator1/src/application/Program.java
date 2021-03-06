package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import domain.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		// list.sort(new MyComparator()); mode 1

		/*
		 * //Comparator<Product> comp = new Comparator<Product>() {
		 * 
		 * @Override public int compare(Product product1, Product product2) { return
		 * product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
		 * } };
		 * 
		 */

		// Comparator using arrow function Example 2
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};

		// Comparator using arrow function Example 3 - removing return and braces
		Comparator<Product> comp2 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	

		list.sort(comp2);

		for (Product product : list)
			System.out.println(product);

	}
}
