package com.java.design.mode.singleton;

class Singleton implements Cloneable {

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SingletonInnerClass.singleton;
	}

	private static class SingletonInnerClass {
		private final static Singleton singleton = new Singleton();
	}

	public void showMessage() {
		System.out.println("ShowMessage");
	}
}

public class Demo {
	public static void main(String[] args) {
		Singleton.getInstance().showMessage();
	}
}