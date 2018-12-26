package oop1204;

public class ThreadTest1 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ThreadTest1 ]"+"\n");
		
		
		// thread 미사용 시 (동작 대기)
		
		MyThread1 t1=new MyThread1(500,"★☆★");
		t1.start();

		MyThread1 t2=new MyThread1(500,"☆★☆★");
		t2.start();

		MyThread1 t3=new MyThread1(500,"★☆★☆★");
		t3.start();
		
		
	}
}

class MyThread1{
	private int num;
	private String name;
	
	public MyThread1(int num, String name) {
		this.num=num;
		this.name=name;
	}
	
	public MyThread1() {
		;
	}
	
	public void run() {
		for(int i=0;i<this.num;i++) System.out.println(name+":"+(i+1));
	}
	
	public void start() {
		run();
	}
	
}


