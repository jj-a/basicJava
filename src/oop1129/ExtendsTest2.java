package oop1129;

public class ExtendsTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ExtendsTest2 ]"+"\n");
		
		Apple apple=new Apple();
		Banana banana=new Banana();
		PineApple pineapple=new PineApple();
		
		System.out.println(apple);
		System.out.println(banana);
		System.out.println(pineapple);
		
		Fruit f=new Fruit();
		System.out.println();
		System.out.println(f.hashCode());
		System.out.println(System.identityHashCode(f));		// 메모리 주소 고유의 해시코드 hashcode(10진수)
		System.out.println(f.toString());		// 객체의 주소값 호출 = pakage.class@hashcode(16진수)
		
	}
}


class Fruit {
	public Fruit() {
		System.out.print("Fruit()"+" ");
	}
}

class Apple extends Fruit {
	public Apple() {
		System.out.println("Apple()");
	}
}

class Banana extends Fruit {
	public Banana() {
		System.out.println("Banana()");
	}
}

class PineApple extends Fruit {
	public PineApple() {
		//super();
		System.out.println("PineApple()");
	}
	@Override
	public String toString() {
		return "PineApple()";
	}
}



