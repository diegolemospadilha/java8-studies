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
	
	/*
	 * Static method to be referenced in the function
	 */
	public static void staticPriceUpdate(Product product) {
		double factor = 1.1;
		product.setPrice(product.getPrice() * factor);
	}
	
	/*
	 * No Static method to be referenced in the function
	 */
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}

	@Override
	public String toString() {
		String formatPrice = String.format("%.2f", price);
		return "Product [name= " + name + ", price= " + formatPrice + "]";
	}
}
