package com.theanswerli.hashtable_iterator;

import java.util.Hashtable;

/**
 * Author: Liming
 * Date: 2018/01/08
 * Company: Lenovo
 */
public class MyService4 {

	public Hashtable hashtable = new Hashtable();

	public MyService4() {
		for (int i = 0; i < 5; i++) {
			hashtable.put("String" + (i + 1), i + 1);
		}
	}
}
