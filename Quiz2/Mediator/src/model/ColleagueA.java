package model;

import mediator.Mediator;

public class ColleagueA extends Colleague{

	public ColleagueA(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		System.out.println("ColleagueA sends: " + message);
		mediator.sendMessage(message, this);
		
	}

	@Override
	public void receive(String message) {
		System.out.println("ColleagueA receives: " + message);
		
	}

}
