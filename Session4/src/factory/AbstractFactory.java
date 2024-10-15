package factory;

import model.Pants;
import model.Shoes;
import model.Tshirt;

public interface AbstractFactory {
	Tshirt CreateTshirt();
	Pants CreatePants();
	Shoes CreateShoes();
}
