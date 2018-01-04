package com.theanswerli;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Liming
 * Date: 2018/01/05
 * Company: Lenovo
 */
public class Test1 {
	public static void main(String[] args) {
		MyRunable1 myRunable1 = new MyRunable1();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		System.out.println("Thread " + Thread.currentThread().getName() + " end");
	}
}
