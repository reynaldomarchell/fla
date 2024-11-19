package cache;

import java.util.HashMap;

public class ProductRepository implements IProductRepository {
	private HashMap<Integer, Product> database = new HashMap<>();
	
	public ProductRepository() {
		database.put(1, new Product(1, "Laptop", 5000000));
		database.put(2, new Product(2, "Smartphone", 4000000));
		database.put(3, new Product(3, "TV", 3000000));
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return database.get(id);
	}

}
