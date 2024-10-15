package factory;

import model.Pants;
import model.PlainPants;
import model.PlainShoes;
import model.PlainTshirt;
import model.Shoes;
import model.Tshirt;

public class PlainFactory implements AbstractFactory {

	public PlainFactory() {
		
	}

	@Override
	public Tshirt CreateTshirt() {
		return new PlainTshirt();
	}

	@Override
	public Pants CreatePants() {
		return new PlainPants();
	}

	@Override
	public Shoes CreateShoes() {
		return new PlainShoes();
	}

}
