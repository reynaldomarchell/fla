package mediator;

public abstract class User {
	protected String name;
	protected ChatMediator mediator;
	
	public User(String name, ChatMediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
}
