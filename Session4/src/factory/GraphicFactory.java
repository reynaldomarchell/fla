package factory;

import model.GraphicPants;
import model.GraphicShoes;
import model.GraphicTshirt;
import model.Pants;
import model.Shoes;
import model.Tshirt;

public class GraphicFactory implements AbstractFactory {

	public GraphicFactory() {
		
	}

	@Override
	public Tshirt CreateTshirt() {
		return new GraphicTshirt();
	}

	@Override
	public Pants CreatePants() {
		return new GraphicPants();
	}
	
	@Override
	public Shoes CreateShoes() {
		return new GraphicShoes();
	}

}
