package factories;

import models.Burger;
import models.BeefBurger;

public class BeefBurgerStore extends BurgerStore {

	@Override
	protected Burger createBurger() {
		String materials = "Beef";
		String name = "Beef Burger";
		Integer price = 30000;
		
		return new BeefBurger(materials, name, price);
	}

}
