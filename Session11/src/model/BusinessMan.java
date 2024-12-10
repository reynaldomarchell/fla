package model;

public class BusinessMan extends Worker {

	public BusinessMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("BusinessMan " + getName() + " is working in the office");
		
	}

	@Override
	public void viewEarning() {
		int earning  = 100000;
		System.out.println("Earning: " + earning);
		
	}

}
