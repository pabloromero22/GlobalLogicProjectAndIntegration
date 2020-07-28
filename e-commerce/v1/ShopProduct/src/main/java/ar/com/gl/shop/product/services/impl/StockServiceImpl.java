package ar.com.gl.shop.product.services.impl;

import ar.com.gl.shop.product.services.StockService;

public class StockServiceImpl implements StockService{

	//CRUD methods
	public void createStock(Long id, Integer quantity, String locationCode) {
		//Repository.getInstance().createStock(Long id, Integer quantity, String locationCode)
	}
	
	public void getStock(Long id) {
		//Repository.getInstance().getStock(Long id)
	}
	
	public void getAllStocks() {
		//List<Stock> allStocks = Repository.getInstance().getAllStocks()
		//TODO print all stocks
	}
	
	public void updateStock(Long id, Integer quantity, String locationCode) {
		//Repository.getInstance().updateStock(Long id, Integer quantity, String locationCode)
	}
	
	public void deleteStock(Long id) {
		
		//TODO
		//Repository...
	}
}
