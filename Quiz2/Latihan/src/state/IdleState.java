package state;

import model.IceCream;
import model.IceCreamMachine;

public class IdleState implements State {
	private IceCreamMachine machine;

	public IdleState(IceCreamMachine machine) {
		this.machine = machine;
	}

	@Override
	public void turnMoney() {
		machine.setCurrState(machine.getSelectingState());
		
	}

	@Override
	public void dispenseMoney() {
		System.out.println("The machine is in idle state");
		
	}

	@Override
	public void generateIceCream() {
		System.out.println("The machine is in idle state");
		
	}

	@Override
	public void pickingIceCream() {
		System.out.println("The machine is in idle state");
		
	}

	@Override
	public IceCream takeIceCream() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "Idle State";
	}

}
