package com.mouni.MultiThreading;

public class ThreadCreation {

	public static void main(String[] args) {
		System.out.println("start main thread");
	    printAtoZ t1=new printAtoZ();
		t1.start();
		System.out.println("end main thread");
		

	}
}
	class printAtoZ  extends Thread{
		public void run() {
			for(char c='a';c<='z';c++) {
				System.out.println(c);
				try {
					Thread.sleep(1250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		}
	}


