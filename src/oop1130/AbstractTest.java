package oop1130;

/*
 *  abstract class 추상 클래스
 * 
 *  - 객체 생성 불가
 *  - 상속만 가능 (parent class)
 *  - child class에서 상속받은 abstract class의 abstract method 재정의 필수
 * 
 */

public class AbstractTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - AbstractTest ]"+"\n");
		
		Animal animal=new Elephant();
		animal.disp();
		
		animal=new Cat();
		animal.disp();

	}
}

abstract class Animal {	
	String name;
	void view() {}
	abstract void disp();
}

class Elephant extends Animal {
	@Override
	void disp() {
		System.out.println("코끼리");
	}
}

class Cat extends Animal {
	@Override
	public void disp() {
		System.out.println("고양이");
	}
}


