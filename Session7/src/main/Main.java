package main;

import java.util.Scanner;

public class Main {
	
	public Main() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Concert name : ");
		String concertName = scan.nextLine();
		
		System.out.println("Enter ticket amount : ");
		Integer ticketAmount = Integer.parseInt(scan.nextLine());
		
		System.out.println("Enter a payment method (Cash / Card): ");
		String paymentMethod = scan.nextLine();
		
		System.out.println("Enter a delivery method : ");
		String deliveryMethod = scan.nextLine();
		
		System.out.println("Enter customer name : ");
		String customerName = scan.nextLine();
		
		TicketFacade ticketFacade = new TicketFacade();
		ticketFacade.orderTickets(concertName, ticketAmount, paymentMethod, deliveryMethod, customerName);
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
