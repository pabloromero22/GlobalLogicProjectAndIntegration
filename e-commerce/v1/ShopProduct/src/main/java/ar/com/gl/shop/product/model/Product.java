package ar.com.gl.shop.product.model;

public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Stock stock;
//    private Category category;
	
    
    //constructor//
public Product(){
	
}
public Product (Long id, String name, String description, Double price, Stock stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
}

    
    //setters and getters
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
  
    
}
