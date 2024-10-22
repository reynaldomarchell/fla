package main;

public class TicketFacade {
	private TicketBooking ticketBooking;
	private TicketDelivery ticketDelivery;
	private TicketPayment ticketPayment;
	
	public TicketFacade() {
		ticketBooking = new TicketBooking();
		ticketDelivery = new TicketDelivery();
		ticketPayment = new TicketPayment();
	}
	
	public void orderTickets(String concertName, 
			Integer ticketAmount, 
			String paymentMethod, 
			String deliveryMethod, 
			String customerName) {
		boolean success = ticketBooking.bookTicket(concertName, ticketAmount);

		if (success) {
			System.out.println("Books " + ticketAmount + " tickets for " + concertName);
			ticketPayment.processPayment(paymentMethod);
			ticketDelivery.deliverTicket(deliveryMethod, customerName, ticketAmount);
			System.out.println("Tickets are successfully purchased!");
		} else {
			System.out.println("Order failed, tickets are not available!");
		}
	}
	
}
