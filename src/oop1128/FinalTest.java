package oop1128;

import java.util.Calendar;

public class FinalTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - FinalTest ]"+"\n");
		
		int a=3;
		a=5;
		final int b=2;
		//b=4;		// error
		
		System.out.println(a+" "+b);
		
		Calendar.getInstance();
		
		
		
	}
}


final class Animal1{		// 상속 불가 (확장성x)
	
	Animal1(){
		
	}
	
	
}

class Animal{
	
	String species;
	
	Animal(){
		;
	}
	
	final public void eat() {
		;
	}
	
	public void breathe() {
		;
	}
	
}

class Elephant extends Animal{		// 부모

	@Override
	public void breathe() {		// Animal.breathe() Overriding
		
	}
	
	/*
	@Override
	public void eat() {		// Animal.eat()이 final이므로 상속/Overriding 불가
		;
	}
	*/
	
}

