package com.theanswerli;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Liming
 * Date: 2018/01/04
 * Company: Lenovo
 */
public class Run4_2 {

	//队列使用 SynchronousQueue类，
	//线程数量大于corePoolSize时，
	//并且超过maximumPoolSize的值8
	//所以出现异常
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " run at " + System.currentTimeMillis());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		Thread.sleep(300);
		System.out.println("A:" + executor.getCorePoolSize());
		System.out.println("A:" + executor.getPoolSize());
		System.out.println("A:" + executor.getQueue().size());
		Thread.sleep(8000);
		System.out.println("B:" + executor.getCorePoolSize());
		System.out.println("B:" + executor.getPoolSize());
		System.out.println("B:" + executor.getQueue().size());
	}

}
