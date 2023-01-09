package com.sandy3647.demoThread;
//the OS has internal scheduler for threads
class Hi extends Thread{
	
	public void run(){
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
class Hello extends Thread{
	
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
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi h = new Hi();		
		Hello he = new Hello();
		h.start();
		he.start();
	}

}
