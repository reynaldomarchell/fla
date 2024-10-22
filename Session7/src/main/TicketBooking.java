package main;

import java.util.HashMap;
import java.util.Map;

public class TicketBooking {
	private Map<String, Integer> availableTickets;
	
	public TicketBooking() {
		availableTickets = new HashMap<>();
		availableTickets.put("Bruno Mars Concert", 100);
		availableTickets.put("Tulus Concert", 100);
		
	}
	
	public boolean bookTicket(String concertName, Integer ticketAmount) {
		Integer stock = availableTickets.get(concertName);
		
		if (stock != null && stock >= ticketAmount) {
			availableTickets.put(concertName, stock - ticketAmount);
			return true;
		}
		
		return false;
	}
}
