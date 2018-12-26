package oop1123;

public class MethodTest2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest2 ]"+"\n");

		test();
		test();
		test(10);
		test(50);
		test(2,4);
		test(2.4);
		test('R');
		test("Photon");
		test(3,4.5,'B',"Hello");
		
	}
	
	public static void test() {
		System.out.println("test() 호출");
		//return;
	}
	
	// overloading
	public static void test(int n) {
		System.out.println("test("+n+") 호출");
		//return;
	}
	
	// overloading
	public static void test(int n, double m) {
		System.out.println("test("+n+", "+m+") 호출");
		//return;
	}
	
	// overloading
	public static void test(double n) {
		System.out.println("test("+n+") 호출");
		//return;
	}
	
	// overloading
	public static void test(char c) {
		System.out.println("test("+c+") 호출");
		//return;
	}
	
	// overloading
	public static void test(String str) {
		System.out.println("test("+str+") 호출");
		//return;
	}
	
	// overloading
	public static void test(int n, double m, char c, String str) {
		System.out.println("test("+n+", "+m+", "+c+", "+str+") 호출");
		//return;
	}
	
}
