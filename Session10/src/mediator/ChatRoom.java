package mediator;

import java.util.ArrayList;

public class ChatRoom implements ChatMediator{
	private ArrayList<User> users = new  ArrayList<>();

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			if (u != user) {
				u.receive(message);
			}
		}
		
	}

	@Override
	public void addUser(User user) {
		users.add(user);
		
	}

}
