package state;

import model.Chef;

public class ChefDeliverState extends State {

	public ChefDeliverState(Chef chef) {
		super(chef);
		System.out.println("Chef " + chef.getChefName() + " is delivering food");
	}

	@Override
	public void changeState() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		chef.setState(new ChefIdleState(chef));
	}

}
