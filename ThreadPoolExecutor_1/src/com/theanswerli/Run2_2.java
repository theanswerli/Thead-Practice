package com.theanswerli;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Liming
 * Date: 2018/01/04
 * Company: Lenovo
 */
public class Run2_2 {

	public static void main(String[] args) throws InterruptedException {
		//队列使用LinkedBlockingDeque类
		//并且线程数量 <= coolPoolSize
		//所以 keepAliveTime > 5 时，也不清除空闲的线程
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "run at " + System.currentTimeMillis());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		//< keepAliveTime时
		Thread.sleep(300);
		System.out.println("A:" + executor.getCorePoolSize());
		System.out.println("A:" + executor.getPoolSize());
		System.out.println("A:" + executor.getQueue().size());
		//大于 keepAliveTime时
		Thread.sleep(8000);
		System.out.println("B:" + executor.getCorePoolSize());
		System.out.println("B:" + executor.getPoolSize());
		System.out.println("B:" + executor.getQueue().size());
	}

}
