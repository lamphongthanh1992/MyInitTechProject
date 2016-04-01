package tlam26;

public class Disc extends Product{
	public Disc() {
		
	}
	private int capacity;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Disc(String name, Double price) {
		super (name, price);
	}
	
}
