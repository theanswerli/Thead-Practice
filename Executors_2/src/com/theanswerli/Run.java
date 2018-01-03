package com.theanswerli;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Author: Liming
 * Date: 2018/01/03
 * Company: Lenovo
 */
public class Run {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			executorService.execute(new MyRunnable("" + i));
		}
	}
}
