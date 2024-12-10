package state;

import model.Chef;

public class ChefCookState extends State {

	public ChefCookState(Chef chef) {
		super(chef);
		System.out.println("Chef " + chef.getChefName() + " is cooking");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chef.setState(new ChefDeliverState(chef));
	}

}
