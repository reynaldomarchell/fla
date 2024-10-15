package client;

import factory.GraphicFactory;
import factory.PlainFactory;
import factory.VintageFactory;
import model.ProductStore;

public class Main {

	public Main() {
		ProductStore Store1 = new ProductStore(new PlainFactory());
		ProductStore Store2 = new ProductStore(new GraphicFactory());
		ProductStore Store3 = new ProductStore(new VintageFactory());
		
		System.out.println("First Store: ");
		Store1.ShowAllProduct();
		System.out.println("\nSecond Store: ");
		Store2.ShowAllProduct();
		System.out.println("\nThird Store: ");
		Store3.ShowAllProduct();
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
