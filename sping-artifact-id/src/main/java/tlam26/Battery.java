package tlam26;

public class Battery extends Product{
	public Battery() {
		
	}
	private Boolean rechargeable;
	public Boolean getRechargeable() {
		return rechargeable;
	}
	public void setRechargeable(Boolean rechargeable) {
		this.rechargeable = rechargeable;
	}
	public Battery (String name, Double price) {
		super(name,price);
	}
}
