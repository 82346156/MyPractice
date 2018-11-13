package com.liyanbg.factory.factory;

import com.liyanbg.factory.product.BMWCar;
import com.liyanbg.factory.product.BenzCar;
import com.liyanbg.factory.product.ICar;

public class CarFactory {

	public static ICar BMWcreate() {
		
		return new BMWCar();
	}

	public static ICar Benzcreate() {

		return new BenzCar();
	}

}
