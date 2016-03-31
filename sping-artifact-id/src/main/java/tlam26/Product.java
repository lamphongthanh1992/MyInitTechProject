package tlam26;

public abstract class Product {
	private String name;
	private String price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Product() {
		
	}
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return this.name + ": " + this.price;
	}
}
