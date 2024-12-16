package main;

import model.Beverage;
import model.Coffee;
import model.HotChocolate;
import model.Tea;

public class Main {

	public Main() {
		System.out.println("Preparing tea...");
		Beverage tea = new Tea();
		tea.prepareRecipe();
		
		System.out.println("\nPreparing coffee...");
		Beverage cofffee = new Coffee();
		cofffee.prepareRecipe();
		
		
		System.out.println("\nPreparing hot chocolate...");
		Beverage hotChocolate = new HotChocolate();
		hotChocolate.prepareRecipe();
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
