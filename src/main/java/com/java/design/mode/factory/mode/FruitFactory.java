package com.java.design.mode.factory.mode;

public class FruitFactory {

	public static Fruit createFruit(Class<?> clazz) throws Exception {
		if (null == clazz) {
			throw new Exception("clazz can not be null!");
		}
		Fruit fruit = null;
		try {
			Object object = Class.forName(clazz.getName()).newInstance();

			if (!(object instanceof Fruit)) {
				throw new ClassCastException("clazz must implements class "+Fruit.class.getTypeName());
			}
			fruit = (Fruit) object;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return fruit;
	}
}
