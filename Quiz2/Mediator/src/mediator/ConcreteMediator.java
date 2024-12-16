package mediator;

import java.util.ArrayList;
import java.util.List;

import model.Colleague;

public class ConcreteMediator implements Mediator {
	private List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void sendMessage(String message, Colleague colleague) {
		for (Colleague colleague1 : colleagues) {
			if (colleague1 != colleague) {
				// colleage1 is not the sender
				colleague1.receive(message);
			}
		}
		
	}

	@Override
	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
		
	}

	

}
