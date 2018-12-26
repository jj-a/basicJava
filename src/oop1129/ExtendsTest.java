package oop1129;

/*
 * 
 *  Inheritance (상속)
 * 
 *  super → sub
 *  선언> class Child extends Parent{}
 *  
 *  final class (상수 클래스) 상속 불가
 *  단일 상속 (한 child class에서 한 parent class만 상속 가능)
 * 
 */

public class ExtendsTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ExtendsTest ]"+"\n");
		
		System.out.println("\nAA class");
		AA a=new AA();
		a.one();
		a.two();

		System.out.println("\nBB class");
		BB b=new BB();
		b.one();
		b.two();
		b.three();

		System.out.println("\nCC class");
		CC c=new CC();
		c.one();
		c.two();
		c.four();

		System.out.println("\nDD class");
		DD d=new DD();
		d.one();
		d.two();
		d.four();
		d.five();
		
		
	}
}

class AA {
	/*
	private void zero() {
		System.out.println("AA.zero()");
	}
	*/
	public void one() {
		System.out.println("AA.one()");
	}
	
	public void two() {
		System.out.println("AA.two()");
	}
	
}

class BB extends AA {
	
	public void three() {
		System.out.println("BB.three()");
	}
	
}

class CC extends AA {
	
	public void four() {
		System.out.println("CC.four()");
	}
	
}

class DD extends CC {
	
	public void five() {
		System.out.println("DD.five()");
	}
	
}

