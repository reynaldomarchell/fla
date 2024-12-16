package state;

import java.util.Scanner;

import model.IceCream;
import model.IceCreamMachine;

public class SelectingIceCreamState implements State {
	private IceCreamMachine machine;

	public SelectingIceCreamState(IceCreamMachine machine) {
		super();
		this.machine = machine;
	}

	@Override
	public void turnMoney() {
		System.out.println("Error");
		
	}

	@Override
	public void dispenseMoney() {
		System.out.println("Money Dispensed");
		machine.setCurrStatus(machine.getIdle());
		
	}

	@Override
	public void generateIceCream() {
		System.out.println("Please select ice cream first");
	}

	@Override
	public void pickingIceCream() {
		Scanner scanner = new Scanner(System.in);
		String type;
		
		do {
			System.out.println("bucket | cone");
			type = scanner.nextLine();
		} while (type.equals("cone"));
		
		machine.setCurrStatus(machine.getGenerating());
		machine.setType(type);
		
	}

	@Override
	public IceCream takeIceCream() {
		System.out.println("There is no ice cream to take");
		return null;
	}
	
	public String toString() {
		return "Selecting Ice Cream State";
	}
	

}
