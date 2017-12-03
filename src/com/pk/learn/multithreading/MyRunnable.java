package com.pk.learn.multithreading;

/**
 * MyRunnable will count the sum of the number from 1 to the parameter
 * countUntil and then write the result to the console.
 * <p>
 * MyRunnable is the task which will be performed
 * 
 * @author pankaj.nayak
 * @since May 31, 2017 11:26:51 AM
 */
public class MyRunnable implements Runnable {

	private final long countUntil;

	public MyRunnable(long countUntil) {
		this.countUntil = countUntil;
	}

	@Override
	public void run() {
		long sum = 0;
		for (int i = 1; i < countUntil; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

}
