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
		//Repository.getInstance().createStock(Long id, Integer quantity, String locationCode)
	}
	
	@Override
	public Stock getStock(Long id) {
		return new Stock();
		//Repository.getInstance().getStock(Long id)
	}
	
	@Override
	public List<Stock> getAllStocks() {
		
		return new ArrayList<Stock>();
		//List<Stock> allStocks = Repository.getInstance().getAllStocks()
		//TODO print all stocks
	}
	
	@Override
	public void updateStock(Stock updatedStock) {
		//Repository.getInstance().updateStock(Long id, Integer quantity, String locationCode)
	}
	
	@Override
	public void deleteStock(Long id) {
		
		//TODO
		//Repository...
	}

}
