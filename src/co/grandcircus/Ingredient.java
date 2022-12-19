package co.grandcircus;

public class Ingredient {
	private String name;
	private String unit;
	private double quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Ingredient() {
		super();
	}
	
	public Ingredient(String name, double quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.unit = "";
	}
	
	public Ingredient(String name, String unit, double quantity) {
		super();
		this.name = name;
		this.unit = unit;
		this.quantity = quantity;
	}


 	


}
