package ar.com.gl.shop.product.model;

public class Stock {
	private Long id;
	private Integer quantity;
	private String locationCode;
	
	public Stock() {				
	}

	public Stock(Long id, Integer quantity, String locationCode) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.locationCode = locationCode;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}
	
	
}
