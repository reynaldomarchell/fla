package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import adapters.CardPaymentAdapter;
import adapters.CashPaymentAdapter;
import adapters.DigitalWalletPaymentAdapter;
import adapters.PaymentAdapter;
import factories.ChocolateBarFactory;
import factories.ChocolateFactory;
import factories.TruffleFactory;
import models.Chocolate;
import singleton.ChocolateDatabase;

public class Main {
	
	public void orderChocolate(Scanner scan, ChocolateDatabase db) {
		System.out.println("Enter chocolate type : "); 
		// Validations
		String type = scan.nextLine();
		if (!type.equals("Chocolate Bar") && !type.equals("Truffle")) {
			System.out.println("Invalid Chocolate Type");
			return;
		}
		
		System.out.println("Enter chocolate name : "); 
		// Validations
		String name = scan.nextLine();
		if (name.isEmpty()) {
			System.out.println("Invalid Chocolate Name");
			return;
		}
		
		System.out.println("Enter chocolate flavor : "); 
		// Validations
		String flavor = scan.nextLine();
		if (flavor.isEmpty()) {
			System.out.println("Invalid Chocolate Flavor");
			return;
		}
		
		List<String> ingredients = new ArrayList<>();
		while (true) {
			System.out.println("Enter ingredient (or type 'done' to finish) : ");
			String ingredient = scan.nextLine();
			if (ingredient.equals("done")) {
				break;
			}
			ingredients.add(ingredient);
		}
		
		System.out.println("Enter Chocolate price : "); 
		// Validations
		double price = Double.parseDouble(scan.nextLine());
		if (price <= 0) {
			System.out.println("Invalid Price");
			return;
		}
		
		System.out.println("Enter Payment Method : ");
		String payment = scan.nextLine();
		
		PaymentAdapter paymentAdapter = null;
		
		switch(payment) {
			case "Cash":
				paymentAdapter = new CashPaymentAdapter();
				break;
			case "Card":
                paymentAdapter = new CardPaymentAdapter();
                break;
			case "Digital Wallet":
				paymentAdapter = new DigitalWalletPaymentAdapter();
				break;
			default:
				System.out.println("Invalid Payment Method");
		}
		
		price = paymentAdapter.getPriceInPayment(price);
		System.out.println("Chocolate ordered successfully!");
		
		ChocolateFactory factory = 
				type.equals("Chocolate Bar") ? new ChocolateBarFactory() : new TruffleFactory();
		
		Chocolate chocolate = factory.createChocolate(name, flavor, ingredients, price);
		
		db.addChocolate(chocolate);
	}
	
	public void viewChocolateOrders(ChocolateDatabase db) {
		List<Chocolate> chocolates = db.getChocolates();
		
		// Validate if chocolates is empty
		if (chocolates.isEmpty()) {
			System.out.println("No orders found!");
			return;
		}
		else {
			for(Chocolate chocolate : chocolates) {
                System.out.println(chocolate.getType());
                System.out.println(chocolate.getName());
                System.out.println(chocolate.getFlavor());
                System.out.println(chocolate.getIngredients());
                System.out.println(chocolate.getPrice());
			}
		}

	}
	
	public Main() {
		Scanner scan = new Scanner(System.in);
		ChocolateDatabase db = ChocolateDatabase.getInstance();
		
		while(true) {
			System.out.println("1. Order Chocolate");
			System.out.println("2. View Chocolate Order");
			System.out.println("3. Exit");
			System.out.print(">> ");
			
			int choice = Integer.parseInt(scan.nextLine());
			
			if(choice == 1) {
				orderChocolate(scan, db);
			}
			else if (choice == 2) {
                viewChocolateOrders(db);
			} else if (choice == 3) {
				break;
			} else {
				System.out.println("Invalid choice!");
			}
		}
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
