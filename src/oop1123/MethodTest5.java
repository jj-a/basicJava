package oop1123;

public class MethodTest5 {

	public static void main(String[] args) {

		System.out.println("[ JJA - MethodTest5 ]"+"\n");
		
		String name[]= {"철수","영희","민수"};
		int kor[]= {10,30,50};
		double avr[]= {1.2,3.4,5.6};
		char word[]= {'C','B','A'};
		
		// call by value
		test(name[0],name[2]);
		test(kor[0],kor[2]);
		test(avr[0],avr[2]);
		test(word[0],word[2]);
		
		System.out.println();
		
		// call by reference
		test(name);
		test(kor);
		test(avr);
		test(word);
		
		System.out.println();
		
		char ch[][]={{'H','E','L','L','O'},{'H','A','P','P','Y'}};
		int num[][]={{10,20,30},{40,50,60}};
		
		test(ch[0][0],ch[1][4]);
		test(num[0][0],num[1][2]);
		
		test(ch);
		test(num);
		
		
	}

	public static void test(String str1, String str2) {
		String arr[]= {str1,str2};
		for(String s:arr) System.out.print(s+" "); 
		System.out.println();
		//return arr;
	}
	
	public static void test(int n, int m) {
		int arr[]= {n,m};
		for(int i:arr) System.out.print(i+" "); 
		System.out.println();
		//return arr;
	}
	
	public static void test(double n, double m) {
		double arr[]= {n,m};
		for(double d:arr) System.out.print(d+" "); 
		System.out.println();
		//return arr;
	}
	
	public static void test(char c1, char c2) {
		char arr[]= {c1,c2};
		for(char c:arr) System.out.print(c+" "); 
		System.out.println();
		//return arr;
	}
	
	public static void test(String str[]) {
		for(String s:str) System.out.print(s+" "); 
		System.out.println();
	}
	
	public static void test(int n[]) {
		for(int i:n) System.out.print(i+" "); 
		System.out.println();
	}
	
	public static void test(double n[]) {
		for(double d:n) System.out.print(d+" "); 
		System.out.println();
	}
	
	public static void test(char ch[]) {
		for(char c:ch) System.out.print(c+" "); 
		System.out.println();
	}
	
	public static void test(char ch[][]) {
		for(char i[]:ch) {
			for(char j:i) System.out.print(j+" ");
			System.out.println();
		}
	}
	
	public static void test(int n[][]) {
		for(int i[]:n) {
			for(int j:i) System.out.print(j+" ");
			System.out.println();
		}
	}
	
}
