package com.theanswerli.hashtable_iterator;

import java.util.Iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread4A extends Thread {

	private MyService4 service4;

	public Thread4A(MyService4 service4) {
		super();
		this.service4 = service4;
	}

	@Override
	public void run() {
		Iterator iterator = service4.hashtable.keySet().iterator();
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
