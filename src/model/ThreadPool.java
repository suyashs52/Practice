package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable {
	private String name;

	public ThreadPool(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				Date d = new Date();
				System.out.println(name + "init time" + sdf.format(d));
			} else {
				Date d = new Date();
				System.out.println(name + "exec time" + sdf.format(d));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"completed");

	}

}
class ThreadPoolTest{
	static void code() {
		Runnable r1=new ThreadPool("t1");
		Runnable r2=new ThreadPool("t2");
		Runnable r3=new ThreadPool("t3");
		Runnable r4=new ThreadPool("t4");
		Runnable r5=new ThreadPool("t5");
		//thread factory
		ExecutorService  pool;
		pool=Executors.newFixedThreadPool(3);
		//pool=Executors.newCachedThreadPool();
		//pool=Executors.newSingleThreadExecutor();
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		pool.shutdown();
	}
}
