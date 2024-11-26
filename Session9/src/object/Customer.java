package object;

import observer.Observer;

public abstract class Customer implements Observer {
	protected String customerName;
	protected String customerType;
	protected Promo restaurantPromo;
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		if (restaurantPromo != null) {
			return String.format("No promo for %s", customerName);
		}
		
		return String.format("%s (%s) %s", customerName, customerType, restaurantPromo);
	}
	
}
