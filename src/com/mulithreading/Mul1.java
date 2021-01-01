package com.mulithreading;

public class Mul1 extends Thread {

	
	public void run() {
		
		for(int i=0;i<=10;i++)
		{
			System.out.println("Hi This is from Thraed Class");
		}
		
	}
	
	
}
class Main1{
	public static void main(String[] args) {
		Mul1 m1=new Mul1();
		Thread t =new Thread(m1);
		t.start();
	}
}