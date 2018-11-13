package com.liyang.simpleFactory.main;

import com.liyang.simpleFactory.factory.CarFactory;
import com.liyang.simpleFactory.product.ICar;

public class MainTest {

	public static void main(String[] args) {
		
		CarFactory carFactory=new CarFactory();
		
		ICar BenCar=carFactory.create("����");
		BenCar.run();	
		
		ICar BMWCar=carFactory.create("����");
		BMWCar.run();	
	}
}
