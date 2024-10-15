package factories;


import models.Burger;
import models.ChickenBurger;

public class ChickenBurgerStore extends BurgerStore {

	@Override
	protected Burger createBurger() {
		String materials = "Chicken";
		String name = "Chicken Burger";
		Integer price = 25000;
		
		return new ChickenBurger(materials, name, price);
	}
	
}
