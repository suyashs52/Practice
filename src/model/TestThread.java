package model;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class TestThread extends Thread {
	long time = 100;
	volatile boolean flag = true;
	private int delay;
	private CountDownLatch latch;
	private CyclicBarrier barrier;

	public TestThread(int delay, CountDownLatch latch, String name) {
		super(name);
		this.delay = delay;
		this.latch = latch;
	}

	public TestThread(int delay, CyclicBarrier barrier, String name) {
		super(name);
		this.delay = delay;
		this.barrier = barrier;
	}

	@Override
	public void run() {

		try {
			System.out.println(Thread.currentThread().getName() + "running");
			Thread.sleep(time);
			// latch.countDown();
			barrier.await();
			System.out.println(Thread.currentThread().getName() + "has finished");

		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TestCyclicBarrier extends Thread {
	long time = 100;
	volatile boolean flag = true;
	private int delay;
	private CountDownLatch latch;

	CyclicBarrier cb = new CyclicBarrier(3);

	public TestCyclicBarrier(int delay, String name) {
		super(name);
		this.delay = delay;

	}

	@Override
	public void run() {

		try {

			TestThread t4 = new TestThread(1, cb, "t4");
			TestThread t5 = new TestThread(1, cb, "t5");

			t4.start();
			t5.start();

			System.out.println(Thread.currentThread().getName() + "running");
			Thread.sleep(time);
			// latch.countDown();
			cb.await();
			System.out.println(Thread.currentThread().getName() + "has finished");

		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// producer consumer
class q {
	int n;
	boolean isValueSet=false;

	synchronized int get() {
		while(!isValueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		isValueSet=false;
		
		System.out.println("get:" + n);
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}

	synchronized void put(int n) {
		
		while(isValueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		isValueSet=true;
		System.out.println("put:" + n);
		this.n = n;
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class producer implements Runnable {
	q qu;
	Thread t;

	producer(q qu) {
		this.qu = qu;
		t = new Thread(this, "producer");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (true) {
			qu.put(i++);
			 
		}

	}

}
class consumer implements Runnable {
	q qu;
	Thread t;

	consumer(q qu) {
		this.qu = qu;
		t = new Thread(this, "consumer");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while (true) {
			qu.get();
			
		}

	}

}


