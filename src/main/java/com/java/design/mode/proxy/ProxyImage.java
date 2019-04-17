package com.java.design.mode.proxy;
/**
 * description: 代理类
 * author: Free
 * email: ghzhang@metinform.cn
 * date: 2019/4/16 13:46
 * version: 1.0
**/
public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		//代理类中创建被代理的类
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}
}