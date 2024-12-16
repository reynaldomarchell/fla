package model;

public class Coffee extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Grinding coffee beans...");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Pouring caramel syrup...");
		
	}

}
