package com.theanswerli.concurrenthashmap;

import com.theanswerli.hashtable.MyService2;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread3B extends Thread {

	private MyService3 service3;

	public Thread3B(MyService3 service3) {
		super();
		this.service3 = service3;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50000; i++) {
			service3.concurrentHashMap.put("ThreadB" + (i + 1), "ThreadB" + i + 1);
			System.out.println("ThreadB" + (i + 1));
		}
	}
}
