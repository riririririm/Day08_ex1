package com.rim.car;

public class CarFactory {

	public void makeCar() {
		EngineAdd en = new EngineAdd();
		WheelAdd wa = new WheelAdd();
		CarView cv = new CarView();
		ColorPaint cp = new ColorPaint();
		
		Car car = new Car();
		car = en.setEngine(car);
		car = wa.setWheel(car);
		cp.setColor(car);
		//cv.view(car);
		
		Car car2 = new Car();
		car2.color="red";
		car2.info("yellow");
	}
}
