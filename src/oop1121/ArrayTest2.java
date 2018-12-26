package oop1121;

public class ArrayTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayTest2 ]"+"\n");
		
		System.out.println("*정수형 배열");
		int arr[]= {10,20,30,40,50};
		int size=arr.length;

		System.out.println("배열 길이 "+size);
		for(int i=0;i<size;i++) System.out.print(arr[i]+" ");

		
		System.out.println("\n\n*실수형 배열");
		double avr[]= {1.2,4.6,5.3};
		size=avr.length;

		System.out.println("배열 길이 "+size);
		for(int i=0;i<size;i++) System.out.print(avr[i]+" ");
		
		
		System.out.println("\n\n*문자열형 배열");
		String name[]= {"철수","영희","진수","춘자"};
		size=name.length;

		System.out.println("배열 길이 "+size);
		for(int i=0;i<size;i++) System.out.print(name[i]+" ");

		
		System.out.println("\n\n*문자형 배열");
		char c[]= {'H','a','p','p','y'};
		size=c.length;

		System.out.println("배열 길이 "+size);
		for(int i=0;i<size;i++) System.out.print(c[i]+" ");
		
		
		System.out.println("\n\n");
		System.out.print("▼문자형 배열에 관한 문제▼");
		
		
		// lab1. 알파벳 p의 개수 구하기
		System.out.println("\n\n[lab1] 알파벳 p의 개수");
		
		int cnt=0;
		for(int i=0;i<size;i++) {
			if(c[i]=='p') cnt++;
		}
		
		System.out.println("알파벳 p = "+cnt+"개");
		
		
		// lab2. 대문자, 소문자 개수 각각 구하기
		System.out.println("\n\n[lab2] 대문자/소문자 개수");

		int cntupp=0, cntlow=0;
		for(int i=0;i<size;i++) {
			if(c[i]>='A'&&c[i]<='Z') cntupp++;
			else if(c[i]>='a'&&c[i]<='z') cntlow++;
		}
		System.out.println("대문자  = "+cntupp+" 소문자 = "+cntlow);
		
		
		// lab3. 대소문자 서로 바꿔 출력하기
		System.out.println("\n\n[lab3] 대/소문자 전환해서 출력");

		for(int i=0;i<size;i++) {
			if(c[i]>='A'&&c[i]<='Z') System.out.print((char)(c[i]+32));
			else if(c[i]>='a'&&c[i]<='z')  System.out.print((char)(c[i]-32));
		}
		
		
		// lab4. 모음의 개수 구하기 (a,e,i,o,u)
		System.out.println("\n\n[lab4] 모음 개수");

		cnt=0;
		char vowel[]= {'a','e','i','o','u','A','E','I','O','U'};
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<vowel.length;j++) {
				if(c[i]==vowel[j]) {
					cnt++; break;
				}
			}
		}
		
		System.out.println("모음 개수 = "+cnt);
		
		
		
	}
}
