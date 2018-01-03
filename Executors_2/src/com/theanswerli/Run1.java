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
		//测试线程的复用..
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable(""+ i));
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			executorService.execute(new MyRunnable("" + i));
		}
	}
}
