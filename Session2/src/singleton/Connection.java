package singleton;

public class Connection {
	private static volatile Connection instance = null;
	
	private Connection () {
		
	}
	
	public static Connection getInstance() {
		if(instance == null) {
			synchronized(Connection.class) {
				if(instance == null) {
					System.out.println("Creating Connection");
					instance = new Connection();
				}
			}
		}
		
		System.out.println("Get Connection");
		return instance;
	}
	
}
