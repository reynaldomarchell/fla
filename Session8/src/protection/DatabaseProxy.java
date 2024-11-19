package protection;

public class DatabaseProxy implements IDatabase {
	private String role;
	private Database database;
	
	public DatabaseProxy(String role) {
		this.role = role;
		this.database = new Database();
	}
	
	
	@Override
	public void executeQuery() {
		if (role.equalsIgnoreCase("admin")) {
			database.executeQuery();
		} else {
			System.out.println("Only admin can execute query.");
		}
		
	}

}
