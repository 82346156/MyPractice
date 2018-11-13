package com.liyang.abstractFactory.factory;

import com.liyang.abstractFactory.product.BenzCar;
import com.liyang.abstractFactory.product.ICar;

public class BenzFactory extends ICarFactory {

	@Override
	public ICar create() {
 		return new BenzCar();
	}

}
