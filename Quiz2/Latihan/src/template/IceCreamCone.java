package template;

import java.util.Scanner;

import model.IceCream;

public class IceCreamCone extends IceCreamTemplate {

	@Override
	protected String prepare() {
		System.out.println("Preparing a cone");
		Scanner scanner = new Scanner(System.in);
		String flavour;
		
		do {
			System.out.println("Pick Flavor: (Chocolate | Strawberry)");
			flavour = scanner.nextLine();
		} while (!flavour.equals("Chocolate") && !flavour.equals("Strawberry"));
		
		return flavour;
	}

	@Override
	protected IceCream generateIceCream(String flavour) {
		return new IceCream("Ice Cream" + flavour, "Cone", flavour);
	}

	

}
