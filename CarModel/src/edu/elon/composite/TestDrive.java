package edu.elon.composite;

public class TestDrive {

	public static void main(String[] args) {
		CarMenu car = new CarMenu("Civic");
		car.addComponent(new CarItem("2015 ERZ EX", 21999.0));
		
		// Colors
		CarMenu colors = new CarMenu("Colors");		
		colors.addComponent(new CarItem("Exterior", 0.0));
		colors.addComponent(new CarItem("Interior", 0.0));
		car.addComponent(colors);
		
		CarMenu accessories = new CarMenu("Accessories");	
		CarMenu intAccess = new CarMenu("Interior");
		CarMenu extAccess = new CarMenu("Exterior");
		CarMenu elecAccess = new CarMenu("Electronic");
		intAccess.addComponent(new CarItem("Side Spoilers", 393.0));
		extAccess.addComponent(new CarItem("Armrest", 313.0));
		elecAccess.addComponent(new CarItem("XM Radio", 820.0));
		accessories.addComponent(intAccess);
		accessories.addComponent(extAccess);
		accessories.addComponent(elecAccess);
		car.addComponent(accessories);
		
		car.print();

	}

}
