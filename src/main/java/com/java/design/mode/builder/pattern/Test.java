package com.java.design.mode.builder.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 构建者模式
 * 
 * @author FreeGuardian
 *
 */
public class Test {

	public static List<Food> Builder(List<Food> list) {
		list = new ArrayList<>();
		list.add(new BeefBurger());
		list.add(new Coffee());
		return list;
	}

	public static void showMessage(List<Food> list) {
		list.forEach(new Consumer<Food>() {
			public void accept(Food t) {
				System.out.println("名称：" + t.getName() + "\t价格：" + t.getPrice());
			}
		});
	}

	public static void main(String[] args) {
		List<Food> list = null;
		list = Builder(list);
		System.err.println(list);
		showMessage(list);
	}
}
