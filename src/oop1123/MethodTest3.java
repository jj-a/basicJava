package oop1123;

public class MethodTest3 {
	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest3 ]"+"\n");
		
		int n;
		
		// lab1. 절대값 (ex. abs(-3))
		System.out.println("[lab1] 절대값");
		n=-3;
		System.out.println("input: "+n);
		System.out.println("output: "+abs(n));
		//System.out.println(Math.abs(n));
		
		
		// lab2. factorial (ex. fact(4))
		System.out.println("\n[lab2] Factorial");
		n=4;
		System.out.println("input: "+n);
		System.out.println("output: "+fact(n));
		
		
		// lab3. 윤년/평년 여부 출력 (ex. leap(2018))
		System.out.println("\n[lab3] 윤년/평년 여부");
		n=2018;
		System.out.println("input: "+n);
		System.out.print("output: ");
		leap(n);
		
		
		// lab4. 그래프 출력 (ex. graph('#',10))
		System.out.println("\n[lab4] 그래프 출력");
		char c='#';
		n=10;
		System.out.println("input: "+c+","+n);
		System.out.print("output: ");
		graph(c,n);
		
		
	}
	
	public static int abs(int n) {		// 절대값
		if(n<0) return -n;
		else return n;
	}
	
	public static int fact(int n) {		// factorial (n!)
		int result=1;
		for(int i=n;i>0;i--) result*=i;
		return result;
	}
	
	public static void leap(int year) {		// 윤년여부
		if(year%4==0&&(year%100!=0||year%400==0)) System.out.println("윤년");
		else System.out.println("평년");
	}
	
	public static void graph(char c,int n) {		// 문자출력
		for(int i=0;i<n;i++) System.out.print(c);
		System.out.println();
	}
	
	
}
