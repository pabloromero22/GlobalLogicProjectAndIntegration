package ar.com.gl.shop.product.services.impl;

import java.util.List;

import ar.com.gl.shop.product.model.Product;
import ar.com.gl.shop.product.services.ProductService;

public class ProductServiceImpl implements ProductService{
//	private ProductRepository repository;
	
//	public ProductServiceImpl(ProductRepository repository) {
//		this.repository = repository;
//	}
	
	
	@Override
	public void createProduct(Product product) {
		//this.repository.createProduct(product)
		
	}

	@Override
	public Product getProduct(Long id) {
		//this.repository.getProduct(id)
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		//this.repository.getAllProducts()
		return null;
	}

}
