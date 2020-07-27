package ar.com.gl.shop.product.model;

public class Category {
	private long id;
	private String name;
	private String descripcion;
	
	
	
	public Category(){}
	
	
	public Category(long id,String name,String descripcion) {
		this.id=id;
		this.name=name;
		this.descripcion=descripcion;	
	}
	
	public  long getId() {return id;}
	public String getName() {return name;}
	public String getDescripcion() {return descripcion;}
	public void setId(long id) {this.id=id;}
	public void setName(String name) {this.name=name;}
	public void setDescripcion(String descripcion) {this.descripcion=descripcion;}
	
	

}
