package oop1204;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ThreadTest2 ]"+"\n");
		
		// thread 사용 시 (유휴시간 동작)

		MyThread2 t1=new MyThread2(500,"★☆★");
		t1.start();

		MyThread2 t2=new MyThread2(500,"☆★☆★");
		t2.start();

		MyThread2 t3=new MyThread2(500,"★☆★☆★");
		t3.start();
		
		
	}
}

class MyThread2 extends Thread {
	private int num;
	private String name;
	
	public MyThread2(int num, String name) {
		this.num=num;
		this.name=name;
	}
	
	public MyThread2() {
		;
	}
	
	@Override
	public void run() {
		for(int i=0;i<this.num;i++) System.out.println(name+":"+(i+1));
	}
	
}
