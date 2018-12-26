package oop1123;

public class MethodTest6 {
	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest6 ]"+"\n");
		
		System.out.println(Math.abs(-3));
		System.out.println(Math.ceil(3.4));
		System.out.println(Math.max(3,5));
		
		System.out.println(Character.isLowerCase('A'));		// 소문자 여부
		System.out.println(Character.isUpperCase('A'));		// 대문자 여부
		System.out.println(Character.toLowerCase('B'));	// 소문자로 변환
		System.out.println(Character.toUpperCase('b'));	 // 대문자로 변환
		
		System.out.println(Integer.toBinaryString(10));	// 2진수
		System.out.println(Integer.toOctalString(10));	// 8진수
		System.out.println(Integer.toHexString(10));		//16진수
		
		
		// lab1. 절대값 구하기
		System.out.println("\n[lab1] 절대값");
		
		int n=-3;
		
		System.out.println("input: "+n);
		System.out.println("output: "+abs(n));
		
		
		// lab2. 숫자 3개 중 최대값 찾기
		System.out.println("\n[lab2] 최대값");
		
		int a=3, b=5, c=7;
		
		System.out.println("input: "+a+","+b+","+c);
		System.out.println("output: "+max(a,b,c));
		
		
		// lab3. 현재까지의 윤년 년수 구하기
		System.out.println("\n[lab3] 윤년 년수");
		
		int cnt=0;
		int year=2018;
		
		for(int i=1;i<=year;i++) {
			if(isLeaf(i)) cnt++;
		}
		
		System.out.println("input: "+"~ "+year);
		System.out.println("output: "+cnt+"년");
		
		
		// lab4. 대소문자 바꿔 출력
		System.out.println("\n[lab4] 대소문자 변환");
		
		char ch='R';
		
		System.out.println("input: "+ch);
		System.out.print("output: ");
		
		if(isUpper(ch)) System.out.println(toLower(ch));
		else if(isLower(ch)) System.out.println(toUpper(ch));
		else System.out.println(ch);
		
		
		// lab5. 이진수로 바꿔 출력
		System.out.println("\n[lab5] 이진수 변환");

		n=200;
		
		System.out.println("input: "+n);
		System.out.print("output: ");
		
		for(int i:toBinary(n)) System.out.print(i);
		
		
	}
	
	public static int abs(int n) {		// 절대값
		if(n<0) return -n;
		else return n;
	}
	
	public static int max(int a,int b,int c) {		// 최대값
		int max=a;
		if(a<b) max=b;
		else if(max<c) max=c;
		return max;
	}

	public static boolean isLeaf(int year) {		// 윤년 여부(t/f)
		if(year%4==0&&(year%100!=0||year%400==0)) return true;
		else return false;
	}

	public static boolean isUpper(char ch) {		// 대문자 여부(t/f)
		if(ch>='A'&&ch<='Z') return true;
		else return false;
	}

	public static boolean isLower(char ch) {		// 소문자 여부(t/f)
		if(ch>='a'&&ch<='z') return true;
		else return false;
	}

	public static char toUpper(char ch) {		// 대문자로 변환
		if(ch>='A'&&ch<='Z') return ch;
		else if(ch>='a'&&ch<='z') return (char)(ch-32);
		else return 0;
	}
	
	public static char toLower(char ch) {		// 소문자로 변환
		if(ch>='A'&&ch<='Z') return (char)(ch+32);
		else if(ch>='a'&&ch<='z') return ch;
		else return 0;
	}
	
	public static int[] toBinary(int n) {		// 10진수→2진수 변환 (*음수는 처리 안함)
		int arr[]= new int[8];
		int i=arr.length-1;
		
		while(i>=0) {
			arr[i]=abs(n%2);
			n/=2;
			i--;
		}
		
		return arr;
	}
	
	
	
}
