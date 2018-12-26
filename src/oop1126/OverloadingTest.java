package oop1126;

public class OverloadingTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OverloadingTest ]"+"\n");
		
		print();
		print(10);
		print(10.0);
		print("JAVA");
		print(5,7);
		print(5.5,7);
		System.out.println(print("hello","Photon"));
		
	}
	
	public static void print() {
		System.out.println("(parameter empty)");
	}

	public static void print(int n) {
		System.out.println("정수형 "+n);
	}

	public static void print(double n) {
		System.out.println("실수형 "+n);
	}
	
	public static void print(int n, int m) {
		System.out.println("정수형 "+n+", "+m);
	}
	
	public static void print(double n, int m) {
		System.out.println("실수형 "+n+", "+"정수형 "+m);
	}
	
	public static void print(String s) {
		System.out.println("문자열 "+s);
	}
	/*	
	public static void print(String str1, String str2) {
		System.out.println("문자열 "+str1+" "+str2);
	}
	*/
	public static String print(String str1,String str2) {
		return str1+" "+str2;
	}
	
}
