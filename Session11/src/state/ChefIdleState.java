package state;

import model.Chef;

public class ChefIdleState extends State {

	public ChefIdleState(Chef chef) {
		super(chef);
		System.out.println("Chef " + chef.getChefName() + " is ready to cook");
	}

	@Override
	public void changeState() {
		chef.setState(new ChefCookState(chef));
		
	}

}
