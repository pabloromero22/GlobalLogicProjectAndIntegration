package ar.com.gl.shop.product.services.impl;

import java.util.ArrayList;
import java.util.List;
import ar.com.gl.shop.product.model.Stock;
import ar.com.gl.shop.product.services.StockService;

public class StockServiceImpl implements StockService{
//	private StockRepository repository;
	
//	public StockServiceImpl(StockRepository repository) {
//		this.repository = repository;
//	}
	
	//CRUD methods
	@Override
	public void createStock(Stock stock) {
		//this.repository.createStock(stock)
	}
	
	@Override
	public Stock getStock(Long id) {
		return new Stock();
		//this.repository.getStock(id)
	}
	
	@Override
	public List<Stock> getAllStocks() {
		
		return new ArrayList<Stock>();
		//List<Stock> allStocks = this.repository.getAllStocks()
		//TODO print all stocks
	}
	
	@Override
	public void updateStock(Stock updatedStock) {
		//repository.updateStock(updatedStock)
	}
	
	@Override
	public void deleteStock(Long id) {
		
		//TODO
		//Repository...
	}

}
