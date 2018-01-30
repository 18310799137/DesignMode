package com.java.design.mode.observer;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}