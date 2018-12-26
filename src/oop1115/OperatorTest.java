package oop1115;

public class OperatorTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - OperatorTest ]"+"\n");
		
		// 산술연산자
		System.out.println("5+3 = "+(5+3));
		System.out.println("5-3 = "+(5-3));
		System.out.println("5*3 = "+(5*3));
		System.out.println("5/3 = "+(5/3));
		System.out.println("3/5 = "+(3/5));
		System.out.println("3/5.0 = "+(3/5.0));

		System.out.println("3%5 = "+(3%5));
		System.out.println();
		
		int a=10;
		
		System.out.println(a%2);
		System.out.println();
		
		
		// 비교연산자
		
		System.out.println("3<5 = "+(3<5));
		System.out.println("3>5 = "+(3>5));
		System.out.println("3<=5 = "+(3<=5));
		System.out.println("3>=5 = "+(3>=5));
		System.out.println("3=5 = "+(3==5));
		System.out.println("3!=5 = "+(3!=5));
		System.out.println();
		
		
		//논리연산자

		System.out.println("3>5 AND 3<5 = "+(3<5&&3<5));
		System.out.println("3>5 OR 3<5 = "+(3>5||3<5));
		System.out.println("NOT 3>5 = "+!(3>5));

		
	}
}
