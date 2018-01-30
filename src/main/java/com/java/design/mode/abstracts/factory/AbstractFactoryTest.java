package com.java.design.mode.abstracts.factory;

/**
 * 抽象工厂模式
 * 
 * @author FreeGuardian
 *
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		WhiteFactory whiteFactory = new WhiteFactory();

		ICat whiteCat = whiteFactory.createCat();

		IDog whiteDog = whiteFactory.createDog();

		BlackFactory blackFactory = new BlackFactory();

		ICat blackCat = blackFactory.createCat();

		IDog blackDog = blackFactory.createDog();

		whiteCat.sleep();

		whiteDog.roar();

		blackCat.sleep();

		blackDog.roar();

	}
}
