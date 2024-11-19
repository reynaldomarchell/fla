package cache;

import java.util.HashMap;

public class ProductRepositoryCache implements IProductRepository {
	private ProductRepository repository;
	HashMap<Integer, Product> cache = new HashMap<>();
	
	public ProductRepositoryCache() {
		this.repository = new ProductRepository();
	}

	@Override
	public Product getProductById(int id) {
		if (!cache.containsKey(id)) {
			System.out.println("Product not found in cache");
			Product product = repository.getProductById(id);
			
			if (product != null) {
				cache.put(id, product);
			}
		}
		else {
			System.out.println("Product already in cache");
		}
		return cache.get(id);
	}

}
