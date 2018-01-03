package com.theanswerli;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Liming
 * Date: 2018/01/03
 * Company: Lenovo
 */
public class Run1 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable1 begin " + System.currentTimeMillis());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("A");
				System.out.println("Runable1 end " + System.currentTimeMillis());
			}
		});

		executorService.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable2 begin " + System.currentTimeMillis());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("B");
				System.out.println("Runable2 end " + System.currentTimeMillis());
			}
		});


	}

}
