package oop1123;

public class MethodTest4 {

	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest4 ]"+"\n");
		
		int a=3, b=5;
		System.out.println(a+"+"+b+" = "+test(a,b));
		
		double d=3.4, e=5.6;
		System.out.println(d+"+"+e+" = "+test(d,e));
		
		char c='R';
		System.out.println(c+" => "+test(c));
		
		System.out.println("문자열 출력: "+test("Hello","World"));

	}
	
	public static int test(int a,int b) {
		int sum=a+b;
		return sum;
	}
	
	public static double test(double a,double b) {
		double sum=a+b;
		return sum;
	}
	
	public static char test(char c) {
		return (char)(c+32);
	}
	
	public static String test(String str1, String str2) {
		return str1+str2;
	}
	
}
