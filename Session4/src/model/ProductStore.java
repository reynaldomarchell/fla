package model;

import factory.AbstractFactory;

public class ProductStore {
	AbstractFactory factory;
	Tshirt tshirt;
	Pants pants;
	Shoes shoes;

	public ProductStore(AbstractFactory factory) {
		this.factory = factory;
	}
	
	public void ShowAllProduct() {
		tshirt = factory.CreateTshirt();
		pants = factory.CreatePants();
		shoes = factory.CreateShoes();
		System.out.println(tshirt.getName());
		System.out.println(pants.getName());
		System.out.println(shoes.getName());
	}
}
