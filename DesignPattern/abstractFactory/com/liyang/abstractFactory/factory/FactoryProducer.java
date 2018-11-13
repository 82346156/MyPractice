package com.liyang.abstractFactory.factory;

public class FactoryProducer {
	public static ICarFactory getFactory(String type) {
		
		if("宝马".equals(type)) {
			return new BMWFactory();
		}else if("奔驰".equals(type)) {
			return new BenzFactory();
		}else {
			System.out.println("错误的工厂类型");
			return null;
		}
	}
}
