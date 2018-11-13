package com.liyang.simpleFactory.factory;

import com.liyang.simpleFactory.product.BMWCar;
import com.liyang.simpleFactory.product.BenzCar;
import com.liyang.simpleFactory.product.ICar;

public class CarFactory {
	
	public ICar create(String type) {
		if("宝马".equals(type)) {
			return new BMWCar();
		}else if("奔驰".equals(type)) {
			return new BenzCar();
		}else {
			System.out.println("请输入正确的类型!");  
			return null;
		}
	}
	
}
