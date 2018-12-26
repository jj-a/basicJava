package oop1123;

import oop1126.ConstructorTest1;

public class ClassTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ClassTest2 ]"+"\n");
		
		// 다른 package의 class를 불러올 수 없음 (Access Modifier:package)
		
		ConstructorTest1 test=new ConstructorTest1();
		test.toString();
		
	}
}
