package com.theanswerli.hashtable_iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Thread4B extends Thread {

	private MyService4 service4;

	public Thread4B(MyService4 service4) {
		this.service4 = service4;
	}

	@Override
	public void run() {
		service4.hashtable.put("z", "zValue");
	}
}
