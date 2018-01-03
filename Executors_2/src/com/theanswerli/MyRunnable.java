package com.theanswerli;

/**
 * Author: Liming
 * Date: 2018/01/03
 * Company: Lenovo
 */
public class MyRunnable implements Runnable {

	private String username;

	public MyRunnable(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " username = " + username + " begin at " + System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " username = " + username + " end at " + System.currentTimeMillis());
	}
}
