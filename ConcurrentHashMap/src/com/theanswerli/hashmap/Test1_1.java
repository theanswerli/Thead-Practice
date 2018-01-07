package com.theanswerli.hashmap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test1_1 {
	//单线程操作 hashmap 没有问题
	public static void main(String[] args) {
		MyService1 service1 = new MyService1();

		Thread1A a = new Thread1A(service1);

		a.start();
	}

}
