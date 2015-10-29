package edu.elon.composite;

public class CarItem extends CarComponent{
	private String name;
	private double price;
	
	public CarItem(String name) {
		this.name = name;
	}
	
	public CarItem(String name, double price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public void print() {
		if (price == 0.0) {
			System.out.println(name);
		} else {
			System.out.println(name + "				" + price);
		} 
	}

	@Override
	public double getPrice() {
		return price;
	}
	
	

}
