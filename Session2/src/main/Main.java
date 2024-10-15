package main;

import factories.BeefBurgerStore;
import factories.BurgerStore;
import factories.ChickenBurgerStore;
import models.Burger;
import singleton.Connection;

public class Main {
	public Main() {
//		Connection connect = Connection.getInstance();
//		Connection connect2 = Connection.getInstance();
		
		BurgerStore beefStore = new BeefBurgerStore();
		Burger beef = beefStore.orderBurger();
		
		BurgerStore chickenStore = new ChickenBurgerStore();
		Burger chicken = chickenStore.orderBurger();
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
