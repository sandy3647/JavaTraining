package com.sandy3647.demoThread;

/*class Rhi implements Runnable {
	public void run() {
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Inside Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Rhello  implements Runnable {
	public void run() {
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Inside Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} */

public class DemoRunnable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*	Runnable rhi = new Rhi();
		Runnable rhe = new Rhello();
		
		Thread t1 = new Thread(rhi);
		Thread t2 = new Thread(rhe);
		
		t1.start();
		t2.start();
		*/
		//from Java 8 we have anonymous classes and lambada expressions and since Threads are functional interfaces we can do it using lambada expressions
		
		Thread rhi1 = new Thread(() -> {
			System.out.println("The thread Name : "+ Thread.currentThread().getName());
			for(int i = 0; i < 5 ; i++) {
				System.out.println("Inside L Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} }, "HiThread");
		Thread rhe1 = new Thread(() -> {
			System.out.println("The thread Name : "+ Thread.currentThread().getName());
			for(int i = 0; i < 5 ; i++) {			
			System.out.println("Inside  L Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}, "HelloThread");
		
		rhi1.start();
		rhe1.start();
		
		rhi1.join(); //wait for T1 to Join back
		rhe1.join(); //wait for T2 to Join back
		//check if the thread is alive
		System.out.println("Is the thread alive : " + rhi1.isAlive());
		
		System.out.println("Bye");
	}

}
