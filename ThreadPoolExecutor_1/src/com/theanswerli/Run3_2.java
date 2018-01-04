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
public class Run3_2 {

	//队列使用 SynchronousQueue类，并且线程数量大于corePoolSize时，
	//将其余的任务也放入池中，总数量为8，并且线程总数量也没有超过maximumPoolSize的值8
	//由于运行的线程数为8，数量上大于CorePoolSize=7
	//所以keepAliveTime>5 时，将清除空闲线程，（使用SynchronousQueue类则maximumPoolSize参数的作用有效）
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
