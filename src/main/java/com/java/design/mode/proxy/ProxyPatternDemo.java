package com.java.design.mode.proxy;

/**
 * 代理模式
 * 
 * @author FreeGuardian
 *
 */
public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		// 图像将无法从磁盘加载
		image.display();
	}
}