package com.mouni.MultiThreading;

import com.mouni.OopsPrograms.This;

public class Demo {

	public static void main(String[] args) {
		Print p=new Print();
		Print p1=new Print();
		Myth t=new Myth(p,"mouni");
		Myth t1=new Myth(p,"rajesh");
	
		
		t.start();
		t1.start();
		

	}

}
class Print{
	public static synchronized void wish(String s) {
		for(int i=1;i<=3;i++) {
			System.out.println("child"+s);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class Myth extends Thread{
	
	Print p;
	String s;
	public Myth(Print p, String s) {
	
	}
	public void run() {
		p.wish(s);
	}
	
}