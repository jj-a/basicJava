package oop1129;

public class SuperTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - SuperTest ]"+"\n");
		
		MiddleSchool ms=new MiddleSchool();
		System.out.println();
		ms.display();

	}
}

class School {
	String name="학교";
	public School() {
		System.out.print("School() ");
	}
}

class MiddleSchool extends School{
	String name="중학교";

	public MiddleSchool() {
		//super();
		System.out.print("MiddleSchool() ");
	}

	public void display() {
		String name = "자바중학교";
	    System.out.println(name);
	    System.out.println(this.name);
	    System.out.println(super.name);
	}
	
}