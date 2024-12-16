package model;

public class Tea extends Beverage {

	@Override
	protected void brew() {
		System.out.println("Crushing tea leaves...");
		System.out.println("Putting it into the cup...");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding sugar...");
		
	}


}
