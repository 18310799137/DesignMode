package com.java.design.mode.abstracts.factory;

public class WhiteFactory implements AnimalFactory {

	@Override
	public IDog createDog() {
		return CreateFactory.dog;
	}

	@Override
	public ICat createCat() {
		return CreateFactory.cat;
	}

	private static class CreateFactory {
		private static IDog dog = new WhiteDog();
		private static ICat cat = new WhiteCat();
	}
}
