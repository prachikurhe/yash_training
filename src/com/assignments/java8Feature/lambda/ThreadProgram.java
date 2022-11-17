package com.assignments.java8Feature.lambda;

public class ThreadProgram {
	/*
	 * 8. With the help of lambda expression implements multithreading. Two threads
	 *    simultaneously work on a resource which is going to be increased by one
	 *    thread and decreased by another thread. Thread one will increase resource
	 *    value by 10% and thread two decreased value by 7%. This process will continue
	 *    until user stop the thread.
	 */
	public static void main(String[] args) {
		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value Of I Is " + i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.start();

		Runnable thread2 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * 2);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread t2 = new Thread(thread2);
		t2.start();
	}

}
