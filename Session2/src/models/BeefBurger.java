package models;

public class BeefBurger extends Burger {

	public BeefBurger(String ingredients, String name, Integer price) {
		super(ingredients, name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeBurger() {
		System.out.println("Grilling beef");
		System.out.println("Wrapping beef into burger");
		System.out.println("Beef burger is ready");
		
	}

}
