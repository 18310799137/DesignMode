package com.java.design.mode.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}