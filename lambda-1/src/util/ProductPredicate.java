package util;

import java.util.function.Predicate;

import domain.Product;

public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product product) {
		return product.getPrice() >= 100;
	}

}
