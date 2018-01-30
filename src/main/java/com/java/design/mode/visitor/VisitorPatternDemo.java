package com.java.design.mode.visitor;

/**
 * 访问者模式
 * 
 * @author FreeGuardian
 *
 */
public class VisitorPatternDemo {
	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}