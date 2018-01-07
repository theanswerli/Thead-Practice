package com.theanswerli.concurrenthashmap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		MyService3 service3 = new MyService3();

		Thread3A a = new Thread3A(service3);
		Thread3B b = new Thread3B(service3);

		a.start();
		b.start();

		Thread.sleep(5000);

		System.out.println("------" + service3.concurrentHashMap.size() + "------------");
	}

}
