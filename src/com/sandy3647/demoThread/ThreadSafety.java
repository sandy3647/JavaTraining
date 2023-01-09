package com.sandy3647.demoThread;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

	// another way is by making the variable thread safe as using the AtomicInteger, StringBuffer, ConcurrentHashMaps
	AtomicInteger counter = new AtomicInteger();
	// thread safety can be achieved by many ways one of them is using the
	// syncronized keyword
	/*
	 * public synchronized void increment() { counter++; }
	 */

	public void increment() {
		counter.incrementAndGet();
	}
}

public class ThreadSafety {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("The value of C :" + c.counter);
	}

}
