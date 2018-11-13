package com.liyanbg.factory.main;

import com.liyanbg.factory.factory.CarFactory;
import com.liyanbg.factory.product.ICar;

public class MainTest {

	public static void main(String[] args) {
		
 		
		ICar BenCar=CarFactory.Benzcreate();
		BenCar.run();	
		
		ICar BMWCar=CarFactory.BMWcreate();
		BMWCar.run();	
	}
}
