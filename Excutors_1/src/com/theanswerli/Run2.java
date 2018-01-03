package com.theanswerli;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Liming
 * Date: 2018/01/03
 * Company: Lenovo
 */
public class Run2 {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("run at time" + System.currentTimeMillis());
				}
			});
		}
	}

}
