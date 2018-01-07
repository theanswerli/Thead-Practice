package com.theanswerli.hashmap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread1A extends Thread {

	private MyService1 service1;

	public Thread1A(MyService1 service1) {
		super();
		this.service1 = service1;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			service1.hashMap.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
			System.out.println("ThreadA" + (i + 1));
		}
	}
}
