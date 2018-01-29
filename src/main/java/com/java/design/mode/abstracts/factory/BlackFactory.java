package com.java.design.mode.abstracts.factory;

public class BlackFactory implements AnimalFactory {

	public IDog createDog() {
		return CreateFactory.dog;
	}

	public ICat createCat() {
		return CreateFactory.cat;
	}

	private static class CreateFactory {
		private static IDog dog = new BlackDog();
		private static ICat cat = new BlackCat();
	}
}
