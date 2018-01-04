package com.theanswerli;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Liming
 * Date: 2018/01/04
 * Company: Lenovo
 */
public class Run4_1 {

	//队列使用 LinkedBlockDeque类，也就是如果线程数量 > corePoolSize 时将其余的任务放入队列中，
	//同一时间最多只能有7个线程在运行
	//如果使用 LinkedBlockDeque类，则maximumPoolSize参数作用将忽略
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
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);
		executor.execute(runnable);//9
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
