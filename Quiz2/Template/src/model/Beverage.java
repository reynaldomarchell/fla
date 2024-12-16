package model;

public abstract class Beverage {
	private void boilWater() {
		System.out.println("Boiling water...");
	}
	
	private void pourInCup() {
		System.out.println("Pouring in to cup...");
	}
	
	protected abstract void brew();
	protected abstract void addCondiments();
	
	public void prepareRecipe() {
		boilWater();
		pourInCup();
		brew();
		addCondiments();
	}
}
