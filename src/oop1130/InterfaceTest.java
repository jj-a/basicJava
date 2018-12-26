package oop1130;
/* 
 *  Interface 인터페이스
 *  abstract method로만 구성
 *  객체생성 불가
 *  상속 - implements (구현) 		 (ex) class Child implements Parent {}
 *  class 상속 시 extends(확장) / interface 상속 시 implements(구현)
 */
public class InterfaceTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - InterfaceTest ]"+"\n");
		
		Son son=new Son();
		Daugther daugther=new Daugther();
		
		son.age();
		son.hobby();
		daugther.age();
		daugther.hobby();

	}
}

interface Parent {
	void age();		// abstract method
	void hobby();
}

class Son implements Parent {
	@Override
	public void age() {
		System.out.println("10세");
	}

	@Override
	public void hobby() {
		System.out.println("음악 감상");
	}
}

class Daugther implements Parent {
	@Override
	public void age() {
		System.out.println("17세");
	}

	@Override
	public void hobby() {
		System.out.println("독서");
	}
}


