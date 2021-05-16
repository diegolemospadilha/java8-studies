package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import domain.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Implementation 1 - remove itens da lista com preço > 100
		//list.removeIf(p -> p.getPrice() >= 100);
		
		// Implementation 2 remove itens da lista com classe que implementa a interface Predicate
		//list.removeIf(new ProductPredicate());
		
		// Implementation 3 - Referenciando metodo estatico da classe produto
		list.removeIf(Product::staticProductPredicate);
		
		// Implementation 4 - Referenciando metodo interno da classe produto
		list.removeIf(Product::nonStaticProductPredicate);
		
		// Implementation 5 - Lambda expressions declarada
		double minimunPrice = 100.0;
		Predicate<Product> pred = (p) -> p.getPrice() >= minimunPrice;
		list.removeIf(pred);
		
		// Implementation 5 - Lambda expressions inline
		list.removeIf((p) -> p.getPrice() >= minimunPrice);
		
		for (Product p: list) {
			System.out.println(p);
		}
	}
}
