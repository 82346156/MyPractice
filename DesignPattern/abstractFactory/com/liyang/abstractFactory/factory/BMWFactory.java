package com.liyang.abstractFactory.factory;

import com.liyang.abstractFactory.product.BMWCar;
import com.liyang.abstractFactory.product.ICar;

public class BMWFactory extends ICarFactory {

	@Override
	public ICar create() {
		return new BMWCar();
	}

}
