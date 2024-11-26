package observer;

import object.Customer;
import object.Promo;

public class VIPCustomer extends Customer {

	public VIPCustomer(String customerName) {
		super(customerName);
		this.customerType = "VIP Customer";
	}

	@Override
	public void update(Promo promo, int type) {
		if (type == 0 || type == 2) {
			this.restaurantPromo = promo;

		}
		
	}

}
