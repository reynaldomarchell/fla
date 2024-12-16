package main;

import mediator.ConcreteMediator;
import mediator.Mediator;
import model.ColleagueA;
import model.ColleagueB;

public class Main {

	public Main() {
		Mediator mediator = new ConcreteMediator();
		ColleagueA colleagueA = new ColleagueA(mediator);
		ColleagueB colleagueB = new ColleagueB(mediator);
		
		mediator.addColleague(colleagueA);
		mediator.addColleague(colleagueB);
		
		colleagueA.send("Hello, how are you?");
		colleagueB.send("I'm fine, thank you!");
	}

	public static void main(String[] args) {
		new Main();

	}

}
