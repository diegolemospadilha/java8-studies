package domain;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	/*
	 * Static method to be referenced in the function
	 */
	public static boolean staticProductPredicate(Product product) {
		return product.getPrice() >= 100;
	}
	
	/*
	 * No Static method to be referenced in the function
	 */
	public boolean nonStaticProductPredicate() {
		return this.getPrice() >= 100;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
