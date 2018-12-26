package oop1204;

public class ThreadTest3 {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ThreadTest3 ]"+"\n");
		
		// thread 사용 시 (유휴시간 동작)

		Thread t1=new Thread(new MyThread3(500,"★☆★"));
		t1.start();
		
		Thread t2=new Thread(new MyThread3(500,"☆★☆★"));
		t2.start();
		
		Thread t3=new Thread(new MyThread3(500,"★☆★☆★"));
		t3.start();
		
		
	}

}

class MyThread3 implements Runnable {
	private int num;
	private String name;
	
	public MyThread3(int num, String name) {
		this.num=num;
		this.name=name;
	}
	
	public MyThread3() {
		;
	}
	
	@Override
	public void run() {
		for(int i=0;i<this.num;i++) System.out.println(name+":"+(i+1));
	}
	
}
