package com.theanswerli.hashtable_iterator;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class Test4 {

	//这个说明hashtable在获取了iterator对象后，不允许更改其结构，否则出现java.util.ConcurrentModificationException
	public static void main(String[] args) throws InterruptedException {
		try {
			MyService4 myService4 = new MyService4();

			Thread4A a = new Thread4A(myService4);
			a.start();

			Thread.sleep(1000);

			Thread4B b = new Thread4B(myService4);
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
