package oop1122;

public class MethodTest1 {
	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest1 ]"+"\n");
		
		System.out.println("1) main 수행");
		test();		// 메소드 호출
		System.out.println("3) main으로 되돌아옴");
		test(10);	// 입력값이 있는 메소드 호출
		System.out.println("5) main으로 되돌아옴");
		
	}
	
	// [범위] [정적여부] [리턴형] [메소드명](){}
	public static void test() {		// 입력값 X
		System.out.println("2) test() 메소드 호출/실행");
		return;	// void형에선 생략가능. 메소드 수행 중에 return하면 중간에 되돌아감
	}
	
	public static void test(int n) {		// 입력값 O
		System.out.println("4) test(n) 메소드 호출/실행 \n     overloading - 입력값 "+n);
	}
	
}
