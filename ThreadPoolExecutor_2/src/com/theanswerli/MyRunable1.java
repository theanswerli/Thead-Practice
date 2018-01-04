package com.theanswerli;

/**
 * Author: Liming
 * Date: 2018/01/05
 * Company: Lenovo
 */
public class MyRunable1 implements Runnable {
	@Override
	public void run() {
		System.out.println("begin " + Thread.currentThread().getName() + " at " + System.currentTimeMillis());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
