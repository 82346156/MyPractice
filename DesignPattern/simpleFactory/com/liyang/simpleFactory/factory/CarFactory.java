package com.liyang.simpleFactory.factory;

import com.liyang.simpleFactory.product.BMWCar;
import com.liyang.simpleFactory.product.BenzCar;
import com.liyang.simpleFactory.product.ICar;

public class CarFactory {
	
	public ICar create(String type) {
		if("����".equals(type)) {
			return new BMWCar();
		}else if("����".equals(type)) {
			return new BenzCar();
		}else {
			System.out.println("��������ȷ������!");  
			return null;
		}
	}
	
}
