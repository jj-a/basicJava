package oop1122;

public class ArrayTest4 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayTest4]"+"\n ");
		
		
		int arr[][]= {{10,20,30},{40,50,60}};
		
		/*
		int arr[][]=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
		*/
		
		
		System.out.println("배열 행 길이: "+arr.length);
		System.out.println("배열 열 길이: "+arr[0].length);
		
		System.out.println();
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("\n");

		
		char ch[][]= {{'Y','e','a','r'},{'M','o','n','t','h'},{'D','a','t','e'}};
		int row=ch.length;

		for(int i=0;i<row;i++) {
			for(int j=0;j<ch[i].length;j++) System.out.print(ch[i][j]+" ");
			System.out.println();
		}
		
		// lab1. 모음의 개수 구하기
		System.out.println("\n\n[lab1] 모음의 개수");
		
		int cnt=0;
		int vowel[]= {'A','E','I','O','U','a','e','i','o','u'};

		for(int i=0;i<row;i++) {
			for(int j=0;j<ch[i].length;j++) {
				for(int k=0;k<vowel.length;k++) {
					if(ch[i][j]==vowel[k]) cnt++;
				}
			}
		}
		
		System.out.println("모음: "+cnt+"글자");

		// lab2. 대소문자 서로 바꿔서 출력
		System.out.println("\n\n[lab2] 대소문자 바꿔 출력");

		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<ch[i].length;j++) {
				if(ch[i][j]>=65&&ch[i][j]<=90) System.out.print((char)(ch[i][j]+32));
				else if(ch[i][j]>=97&&ch[i][j]<=122) System.out.print((char)(ch[i][j]-32));
			}
			System.out.println();
		}
		
		
		
	}
}
