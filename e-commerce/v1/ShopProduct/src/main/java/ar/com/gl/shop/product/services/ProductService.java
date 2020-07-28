package ar.com.gl.shop.product.services;

import java.util.List;
import ar.com.gl.shop.product.model.Product;

public interface ProductService {

	//CRUD methods
	public void createProduct(Product product);
	public Product getProduct(Long id);
	public List<Product> getAllProducts();
}
