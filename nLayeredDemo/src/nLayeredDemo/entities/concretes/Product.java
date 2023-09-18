package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstacts.Entitiy;

public class Product implements Entitiy {
	private int id;
	private String name;
	private int categoryId;
	private int unitInStock;
	private double unitPrice;
	
	public Product() {}
	
	public Product(int id, String name, int categoryId, int unitInStock, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.unitInStock = unitInStock;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
}
