package com.theanswerli.hashmap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test1_2 {
	public static void main(String[] args) throws InterruptedException {
		MyService1 service1 = new MyService1();
		//两个线程 同时操作 hashmap，最后获取 hashmap的size，多次运行，发现数据可能不一致，证明hashmap非线程安全
		Thread1A a = new Thread1A(service1);
		Thread1B b = new Thread1B(service1);
		a.start();
		b.start();

		Thread.sleep(5000);

		System.out.println("------" + service1.hashMap.size() + "------------");
	}
}
