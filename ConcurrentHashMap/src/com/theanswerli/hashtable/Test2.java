package com.theanswerli.hashtable;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		MyService2 service2 = new MyService2();
		//两个线程 同时操作 hashtable，最后获取 hashtable的size，多次运行，发现数据一致，证明hashtable线程安全
		Thread2A a = new Thread2A(service2);
		Thread2B b = new Thread2B(service2);
		a.start();
		b.start();

		Thread.sleep(5000);

		System.out.println("------" + service2.hashtable.size() + "------------");
	}
}
