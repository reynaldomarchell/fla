package models;

public class ChickenBurger extends Burger {

	public ChickenBurger(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeBurger() {
		System.out.println("Frying chicken");
		System.out.println("Wrapping chicken into burger");
		System.out.println("Chicken burger is ready");
		
	}
	
}
