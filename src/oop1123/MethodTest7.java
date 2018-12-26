package oop1123;

public class MethodTest7 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - MethodTest6 ]"+"\n");
		
		System.out.println("- Factorial(n!) test -");
		int n=5;
		System.out.println(n+"! = "+fact(n));
		
	}
	
	public static int fact(int n) {
			if(n==0) return 0;	// 입력값이 0일 경우
			else if(n==1) return 1;
			else return n*fact(n-1);
	}
	
}
