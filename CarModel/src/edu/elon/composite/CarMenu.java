package edu.elon.composite;

import java.util.ArrayList;

public class CarMenu extends CarComponent{
	
	private ArrayList <CarComponent> components;
	private String name;
	
	public CarMenu(String name) {
		this.name = name;
		components = new ArrayList<CarComponent>();
	}
	
	public CarMenu(String name, CarComponent c) {
		this.name = name;
		components = new ArrayList<CarComponent>();
		components.add(c);
	}
	
	@Override
	public void print() {
		System.out.println(name);
		for (CarComponent c: components) {
			c.print();
		}
	}
	
	public void addComponent(CarComponent c) {
		components.add(c);
	}
	
}
