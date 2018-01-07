package com.theanswerli.concurrenthashmap_iterator;

import java.util.Iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread5A extends Thread {

	private MyService5 service5;

	public Thread5A(MyService5 service5) {
		super();
		this.service5 = service5;
	}

	@Override
	public void run() {
		Iterator iterator = service5.concurrentHashMap.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
