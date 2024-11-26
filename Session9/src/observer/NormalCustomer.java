package observer;

import object.Customer;
import object.Promo;

public class NormalCustomer extends Customer {

	public NormalCustomer(String customerName) {
		super(customerName);
		this.customerType = "Normal Customer";
	}

	@Override
	public void update(Promo promo, int type) {
		if (type == 0 || type == 1) {
			this.restaurantPromo = promo;
			
		}
		
	}

}
