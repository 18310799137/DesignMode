package com.java.design.mode.DesignMode;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Hashtable<Object, Object> hashtable = new Hashtable<Object, Object>();

		hashtable.put("key", "value");

		hashtable.put("key1", "value1");

		hashtable.put("test", "vaTest");

		Enumeration<Object> enumeration = hashtable.keys();

		HashMap<String, Object> map = new HashMap<>();

		map.get("key");
		
		while (enumeration.hasMoreElements()) {
			Object key = enumeration.nextElement();
			System.out.println(key + ":" + hashtable.get(key));
		}
		ConcurrentLinkedDeque<Object>deque = new ConcurrentLinkedDeque<>();
		
		deque.addLast("1");
		deque.addLast("2");
		deque.addLast("3");
		deque.addLast("4");
		
		deque.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object t) {
				deque.remove();
					System.out.println(t);
			}
		});
		
		
		deque.forEach(new Consumer<Object>() {

			@Override
			public void accept(Object t) {
					System.out.println(t);
			}
		});
		
	}
}
