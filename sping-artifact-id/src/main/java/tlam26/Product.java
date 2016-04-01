package tlam26;

public abstract class Product {
	private String name;
	private Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Product() {
		
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString() {
		return this.name + ": " + this.price;
	}
}
