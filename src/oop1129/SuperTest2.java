package oop1129;

public class SuperTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - SuperTest2 ]"+"\n");
		
		Child c=new Child(1,2,3);
		System.out.println(c.one+" "+c.two+" "+c.three);
		
	}
}

class Parent{
	int one, two;
	
	public Parent() {
		;
	}
	
	public Parent(int one, int two) {
		this.one=one;
		this.two=two;
	}
}

class Child extends Parent{
	int three;
	
	public Child() {
		;
	}
	
	public Child(int a, int b, int c) {
		super(a,b);
		this.three=c;
	}
}
