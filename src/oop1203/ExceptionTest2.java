package oop1203;

public class ExceptionTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ExceptionTest2 ]"+"\n");
		
		
		try {
			System.out.println("OPEN");
			Test test=new Test();
			test.print();
			test.disp();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("CLOSE");
		}
		System.out.println("END");

	}
}


class Test {
	
	public void print() throws Exception {
			int a=3/0;
			System.out.println(a);
	}
	
	public void disp() throws Exception {
			int a=Integer.parseInt("SKY");
			System.out.println(a);
	}
	
}