package observable;

import java.util.ArrayList;

import object.Promo;
import observer.Observer;

public class Restaurant {
	private ArrayList<Observer> customers;
	
	public Restaurant() {
        this.customers = new ArrayList<>();
    }

	public void addObserver(Observer customer) {
		customers.add(customer);
	}
	
	public void removeObserver(Observer customer) {
		customers.remove(customer);
	}
	
	public void notifyObserver(Promo promo, int type) {
		for (Observer customer : customers) {
			customer.update(promo, type);
		}
	}
	
	public void viewObserver() {
		if (customers.isEmpty()) {
			System.out.println("No customer");
        } else {
            for (Observer customer : customers) {
            	System.out.println(customer);
            }
		}
	}
}
