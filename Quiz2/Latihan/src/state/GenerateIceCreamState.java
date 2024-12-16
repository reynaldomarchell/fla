package state;

import model.IceCream;
import model.IceCreamMachine;
import template.IceCreamCone;

public class GenerateIceCreamState implements State {
	IceCreamMachine machine;
	private IceCreamCone cone;

	@Override
	public void turnMoney() {
		System.out.println("Cant turn money");
		
	}

	@Override
	public void dispenseMoney() {
		System.out.println("Money dispensed");
		machine.setCurrState(machine.getIdle());
		
	}

	@Override
	public void generateIceCream() {
		if(machine.getType() == "cone") {
			machine.setIceCream(cone.generateIceCream());
			machine.setCurrState(machine.getReady());
		}
		
	}

	@Override
	public void pickingIceCream() {
		System.out.println("Cant pick ice cream");
		
	}

	@Override
	public IceCream takeIceCream() {
		System.out.println("No ice cream is selected");
		return null;
	}
	

}
