package factories;

import models.Burger;

public abstract class BurgerStore {
	public Burger orderBurger() {
		System.out.println("Creating burger...");
		Burger burger = createBurger();
		burger.makeBurger();
		System.out.println("Serving");
		return burger;
	}
	
	protected abstract Burger createBurger();
}
