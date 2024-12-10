package model;

public class FireMan extends Worker {
	private int houseExtinquished;
	
	public FireMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		houseExtinquished = random.nextInt(5) + 1;
		System.out.println(getName() + " extinquished " + houseExtinquished + " houses");
		
	}

	@Override
	public void viewEarning() {
		int earning = 50000 * houseExtinquished;
		System.out.println("Earning: " + earning);
		
	}

}
