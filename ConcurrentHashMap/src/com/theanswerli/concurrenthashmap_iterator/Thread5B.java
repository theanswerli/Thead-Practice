package com.theanswerli.concurrenthashmap_iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread5B extends Thread {

	private MyService5 service5;

	public Thread5B(MyService5 service5) {
		this.service5 = service5;
	}

	@Override
	public void run() {
		service5.concurrentHashMap.put("z", "zValue");
	}
}
