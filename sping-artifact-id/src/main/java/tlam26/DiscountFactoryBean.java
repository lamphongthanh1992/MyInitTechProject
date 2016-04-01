package tlam26;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class DiscountFactoryBean extends AbstractFactoryBean{

	@Override
	protected Object createInstance() throws Exception {
		product.setPrice(product.getPrice()*(1 - discount));
		return product;
	}

	@Override
	public Class getObjectType() {
		return product.getClass();
	}
	
	private Product product;
	private double discount;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
