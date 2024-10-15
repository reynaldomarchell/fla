package singleton;

import java.util.ArrayList;
import java.util.List;

import models.Chocolate;

public class ChocolateDatabase {

	private static volatile ChocolateDatabase instance;
	private List<Chocolate> chocolates;
	
	private ChocolateDatabase() {
		chocolates = new ArrayList<>();
	}
	
	public static ChocolateDatabase getInstance() {
		if (instance == null) {
			synchronized(ChocolateDatabase.class) {
				if (instance == null) {
					instance = new ChocolateDatabase();
				}
			}
		}
		return instance;
	}
	
	public void addChocolate(Chocolate chocolate) {
		chocolates.add(chocolate);
	}
	
	public List<Chocolate> getChocolates() {
		return chocolates;
	}
}
