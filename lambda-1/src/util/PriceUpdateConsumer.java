package util;

import java.util.function.Consumer;

import domain.Product;

public class PriceUpdateConsumer implements Consumer<Product>{

	@Override
	public void accept(Product product) {
		double percentage = 1.1;
		product.setPrice(product.getPrice() * percentage);
	}

}
