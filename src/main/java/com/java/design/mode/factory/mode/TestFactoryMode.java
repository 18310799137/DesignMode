package com.java.design.mode.factory.mode;

public class TestFactoryMode {

	public static void main(String[] args) throws Exception {
		Fruit apple = FruitFactory.createFruit(Apple.class);
		apple.CanEat();

		Fruit banana = FruitFactory.createFruit(Banana.class);
		banana.CanEat();

	}
}
