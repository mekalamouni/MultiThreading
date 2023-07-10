package com.mouni.MultiThreading;

public class Inrface {

	public static void main(String[] args) {
	 System.out.println("main start");
	 Number n=new Number();
	 Thread t1=new Thread(n);
	 t1.start();
	Alphabetic a = new Alphabetic();
	a.start();
	System.out.println(Thread.currentThread().getName());
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().getId());
	
	 

	}

}
class Alphabetic extends Thread{
	@Override
	public void run() {
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Number implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=26;i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
