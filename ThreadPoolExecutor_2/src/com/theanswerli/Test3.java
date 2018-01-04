package com.theanswerli;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Author: Liming
 * Date: 2018/01/05
 * Company: Lenovo
 */
public class Test3 {
	//调用shutdown方法来来停止线程池，所以最后线程池执行完任务后直接关闭
	//注意：shutdown是等所有任务执行完了之后，才关闭
	public static void main(String[] args) {
		MyRunable1 myRunable1 = new MyRunable1();
		ThreadPoolExecutor executor = new ThreadPoolExecutor(7, 8, 5,
				TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
		executor.execute(myRunable1);
		executor.execute(myRunable1);
		executor.execute(myRunable1);
		executor.execute(myRunable1);
		executor.execute(myRunable1);
		executor.execute(myRunable1);
		executor.shutdown();
		System.out.println("Thread " + Thread.currentThread().getName() + " end");
	}
}
