package main;

public class TicketDelivery {
	public void deliverTicket(String deliveryMethod, String customerName, Integer ticketAmount) {
		System.out.println("Delivering " + ticketAmount + 
				" tickets using " + deliveryMethod + 
				" to " + customerName );
	}

}
