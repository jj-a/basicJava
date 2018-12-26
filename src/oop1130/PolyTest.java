package oop1130;
/*
 *  Polymorphism (다형성)
 *  
 *  1) child class -> parent class 대입 가능
 *  2) parent class -> child class 대입 가능 (단, child class 형태로 변환해야함)
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - PolyTest ]"+"\n");
		
		School s=new School();
		s.display();
		
		HighSchool hs=new HighSchool("자바고등학교","관철동");
		MiddleSchool ms=new MiddleSchool("자바중학교","인사동");
		
		hs.display();
		ms.display();
		
		School sc=new HighSchool("자바고등학교","관철동");
		sc.display();
		
		sc=new MiddleSchool("자바중학교","인사동");
		sc.display();
		
		Object obj=new School("자바학교","종로");		// Object class = 최고 조상 클래스
		System.out.println(obj.toString());
		
	}
}

class School {		// parent class
	public String name="학교";
	public String addr="주소";
	
	public School(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
	public School() {
		;
	}
	
	public void display() {
		System.out.println(name+" "+addr);
	}
	
}

class HighSchool extends School {		// child class

	public HighSchool(String name, String addr) {
		super(name, addr);
	}

	public HighSchool() {
		;
	}
	
}

class MiddleSchool extends School {		// child class

	public MiddleSchool(String name, String addr) {
		super(name, addr);	
	}

	public MiddleSchool() {
		;
	}
	
}

