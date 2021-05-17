package util;

import java.util.function.Function;

import domain.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product product) {
		return product.getName().toUpperCase();
	}

}
