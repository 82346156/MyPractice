package com.liyang.abstractFactory.factory;

public class FactoryProducer {
	public static ICarFactory getFactory(String type) {
		
		if("����".equals(type)) {
			return new BMWFactory();
		}else if("����".equals(type)) {
			return new BenzFactory();
		}else {
			System.out.println("����Ĺ�������");
			return null;
		}
	}
}
