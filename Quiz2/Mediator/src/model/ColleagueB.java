package model;

import mediator.Mediator;

public class ColleagueB extends Colleague {

	public ColleagueB(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println("ColleagueB sends: " + message);
		mediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		System.out.println("ColleagueB receives: " + message);
		
	}


}
