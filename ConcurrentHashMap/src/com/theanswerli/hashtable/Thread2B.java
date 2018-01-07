package com.theanswerli.hashtable;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread2B extends Thread {

	private MyService2 service2;

	public Thread2B(MyService2 service2) {
		super();
		this.service2 = service2;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			service2.hashtable.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
			System.out.println("ThreadB" + (i + 1));
		}
	}
}
