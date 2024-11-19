package main;

import cache.IProductRepository;
import cache.ProductRepository;
import cache.ProductRepositoryCache;
import protection.DatabaseProxy;
import protection.IDatabase;
import virtual.IImagePreview;
import virtual.ImagePreviewProxy;

public class Main {
	public Main() {
//		IDatabase admin = new DatabaseProxy("admin");
//		admin.executeQuery();
//		
//		IDatabase user = new DatabaseProxy("user");
//		user.executeQuery();
		
		
//		IImagePreview imagePreview = new ImagePreviewProxy("image.png");
//		imagePreview.show();
//		imagePreview.show();
		
		IProductRepository repository = new ProductRepositoryCache();
		repository.getProductById(1).printProduct();
		repository.getProductById(1).printProduct();
		repository.getProductById(1).printProduct();
	}

	public static void main(String[] args) {
		new Main();

	}

}
