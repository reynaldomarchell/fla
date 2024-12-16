package model;

public class HotChocolate extends Beverage{

	@Override
	protected void brew() {
		System.out.println("Melting chocolate bar...");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding whipped cream...");
		
	}

}
