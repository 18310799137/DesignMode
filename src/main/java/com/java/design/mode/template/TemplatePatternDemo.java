package com.java.design.mode.template;

/**
 * 模板模式
 * 
 * @author FreeGuardian
 *
 */
public class TemplatePatternDemo {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}