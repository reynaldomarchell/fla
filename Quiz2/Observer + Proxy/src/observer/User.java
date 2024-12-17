package observer;

public class User implements Observer{
	private String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String blogName, String message) {
		System.out.println(name + " received " + blogName + " " + message);
	}
}
