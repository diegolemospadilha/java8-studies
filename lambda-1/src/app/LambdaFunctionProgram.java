package app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import domain.Product;
import util.UpperCaseName;

public class LambdaFunctionProgram {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		// Implementacao 1 atualiza nome dos produtos com classe que implementa a interface Function
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		// Implementacao 2 atualiza nome dos produtos com classe que executa funcao estatica da classe Product
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		// Implementacao 3 atualiza nome dos produtos com classe que executa funcao interna da classe Product
		//List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
		
		// Implementacao 4 atualiza nome dos produtos com expressao lambda declarada
		Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		// Implementacao 5 atualiza preco dos produtos com expressao lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
