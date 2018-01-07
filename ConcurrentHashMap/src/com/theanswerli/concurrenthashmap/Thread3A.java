package com.theanswerli.concurrenthashmap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread3A extends Thread {
	private MyService3 service3;

	public Thread3A(MyService3 service3) {
		super();
		this.service3 = service3;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			service3.concurrentHashMap.put("ThreadA" + (i + 1), "ThreadA" + i + 1);
			System.out.println("ThreadA" + (i + 1));
		}
	}
}
