package factory;

import model.Pants;
import model.Shoes;
import model.Tshirt;
import model.VintagePants;
import model.VintageShoes;
import model.VintageTshirt;

public class VintageFactory implements AbstractFactory {

	public VintageFactory() {
		
	}

	@Override
	public Tshirt CreateTshirt() {
		
		return new VintageTshirt();
	}

	@Override
	public Pants CreatePants() {
		
		return new VintagePants();
	}

	@Override
	public Shoes CreateShoes() {
		
		return new VintageShoes();
	}

}
