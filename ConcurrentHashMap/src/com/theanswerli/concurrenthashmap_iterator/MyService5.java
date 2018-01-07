package com.theanswerli.concurrenthashmap_iterator;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class MyService5 {
	public ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

	public MyService5() {
		for (int i = 0; i < 5; i++) {
			concurrentHashMap.put("key" + (i + 1), i + 1);
		}
	}
}
