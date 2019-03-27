package com.rim.car;

public class CarView {

	public void view(Car car) {
		System.out.println("엔진파워:"+car.engine.hp);
		for(int i=0;i<car.wheels.length;i++) {
			System.out.println(i+1+"번째 바퀴색깔:"+car.wheels[i].color +" 크기:"+car.wheels[i].size);
		}
		System.out.println("차 색상:"+car.color);
	}
}
