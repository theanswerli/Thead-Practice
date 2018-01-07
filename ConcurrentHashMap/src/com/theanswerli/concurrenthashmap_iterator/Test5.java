package com.theanswerli.concurrenthashmap_iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test5 {

	//对比Test4，说明concurrenthashmap支持多线程修改其结构，而hashtable不支持，这是他们的区别
	public static void main(String[] args) {
		try {
			MyService5 myService5 = new MyService5();

			Thread5A a = new Thread5A(myService5);
			a.start();

			Thread.sleep(1000);

			Thread5B b = new Thread5B(myService5);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
