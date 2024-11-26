package main;

import java.util.Scanner;

import object.Promo;
import observable.Restaurant;
import observer.NormalCustomer;
import observer.Observer;
import observer.VIPCustomer;

public class Main {
	Scanner scan = new Scanner(System.in);
	private Restaurant restaurant = new Restaurant();
	
	
	private void addObserver() {
		System.out.println("Customer name: ");
		String name = scan.nextLine();
		System.out.println("Customer type (Normal[0], VIP[1]): ");
		int type = scan.nextInt();
		scan.nextLine();
		
		Observer customer = null;
		if (type == 0) {
			// Normal Customer
			customer = new NormalCustomer(name);
		} else if (type == 1) {
			// VIP Customer
			customer = new VIPCustomer(name);
		}
		
		restaurant.addObserver(customer);
		scan.nextLine();
		
	}
	
	private void viewObserver() {
		restaurant.viewObserver();
		scan.nextLine();
	}
	
	private void notifyObserver() {
		System.out.println("Promo Name: ");
		String promoName = scan.nextLine();
		System.out.println("Promo Content: ");
		String promoContent = scan.nextLine();
		
		Promo promo = new Promo(promoName, promoContent);
		
		System.out.println("Promo type (All[0], Normal[1], VIP[2]): ");
		int type = scan.nextInt();
		scan.nextLine();
		
		restaurant.notifyObserver(promo, type);
		scan.nextLine();
	}

	public Main() {
		int choice = -1;
		
		do {
			System.out.println("Menu");
			System.out.println("1. View all Customers");
			System.out.println("2. Add new Observer");
			System.out.println("3. Notify promo");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();
			scan.nextLine();
			
			if (choice == 1) {
				viewObserver();
				
			} else if (choice == 2) {
				addObserver();
				
			} else if (choice == 3) {
				notifyObserver();
				
			}
		} while (choice != 4);
	}

	public static void main(String[] args) {
		new Main();

	}

}
