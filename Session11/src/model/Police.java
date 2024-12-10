package model;

public class Police extends Worker {
	private int thiefFound;
	
	public Police(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		thiefFound = random.nextInt(3) + 1;
		System.out.println("Police " + getName() + " found " + thiefFound + " thief");
	}

	@Override
	public void viewEarning() {
		int earning = 75000 * thiefFound;
		System.out.println("Earning: " + earning);
		
	}

}
