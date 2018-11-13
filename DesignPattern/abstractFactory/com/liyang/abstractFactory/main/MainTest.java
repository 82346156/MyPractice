package com.liyang.abstractFactory.main;

import com.liyang.abstractFactory.factory.FactoryProducer;
import com.liyang.abstractFactory.factory.ICarFactory;
import com.liyang.abstractFactory.product.ICar;

public class MainTest {

	public static void main(String[] args) {
		ICarFactory BMWCarFactory=FactoryProducer.getFactory("±¦Âí");
		ICar BMWCar= BMWCarFactory.create();
		BMWCar.run();
		
		ICarFactory BenzCarFactory=FactoryProducer.getFactory("±¼³Û");
		ICar BenzCar=BenzCarFactory.create();
		BenzCar.run();
	}
}
