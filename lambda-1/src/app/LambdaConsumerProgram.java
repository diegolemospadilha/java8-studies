package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import domain.Product;
import util.PriceUpdateConsumer;

public class LambdaConsumerProgram {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Implementacao 1 atualiza preco dos produtos com classe que implementa a
		// interface Consumer
		// list.forEach(new PriceUpdateConsumer());

		// Implementacao 2 atualiza preco dos produtos referenciando metodo statico da
		// classe Product
		// list.forEach(Product::staticPriceUpdate);

		// Implementacao 3 atualiza preco dos produtos referenciando metodo interno da
		// classe Product
		// list.forEach(Product::nonStaticPriceUpdate);

		// Implementacao 4 atualiza preco dos produtos com expressao lambda declarada
		//Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 1.1);
		//list.forEach(consumer);

		// Implementacao 5 atualiza preco dos produtos com expressao lambda inline
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));

		list.forEach(System.out::println);
	}
}
