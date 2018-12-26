package oop1119;

public class ForTest1 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ForTest1 ]"+"\n");
		
		
		for(int i=10;i<=100;i++) System.out.print(i+"JAVA ");
		System.out.println();
		for(int i=100;i>=10;i-=10) System.out.print(i+"JSP ");
		
		
		// 문자형 반복문
		System.out.println();
		for(char c='A';c<='Z';c++) System.out.print(c);
		System.out.println();

		
		//★구구단★
		System.out.println("\n\n[구구단]");
		
		for(int i=2;i<=9;i++) {
			System.out.print(i+"단> ");
			for(int j=1;j<=9;j++) System.out.print(i+"*"+j+"="+i*j+"  ");
			System.out.println();
		}
		
		// 1~5중 짝수만 출력
		System.out.println("\n\n[1~5중 짝수 출력]");
		
		for(int i=1;i<=5;i++) {
			if(i%2==0) System.out.print(i+" ");
		}
		System.out.println();

		
		// 1~5 중 짝수의 개수 출력
		System.out.println("\n\n[1~5 중 짝수의 개수 출력]");
		
		int cnt=0;
		for(int i=1;i<=5;i++) if(i%2==0) cnt++;
		System.out.println("짝수 개수: "+cnt);
		

		// AC1~2018년 중 윤년 출력하기
		System.out.println("\n\n[현재까지의 윤년]");
		int year=2018;
		int segi=1;
		System.out.print(segi+"세기) ");
		for(int i=1;i<=year;i++) {
				if(i/100!=segi-1) {				//do while문에 더 적합한 알고리즘
					segi++;
					System.out.print("\n"+segi+"세기) ");
				}
				if(i%4==0&&i%100!=0||i%400==0) System.out.print(i+"년 ");
		}
		
		System.out.println();
		

		// AC1~2018년 중 윤년 년수 구하기
		System.out.println("\n\n[현재까지의 윤년 년수]");
		year=2018;
		cnt=0;
		for(int i=1;i<=year;i++) {
			if(i%4==0&&i%100!=0||i%400==0) cnt++;
		}
		System.out.println("1~2018년 중 윤년의 해: "+cnt+"(년)");
		
		
		//알파벳 한줄에 5개씩 출력
		System.out.println("\n\n[알파벳 한줄에 5개씩 출력]");
		
		for(char i='A';i<='Z';) {	
			for(int j=1;j<=5;j++) {
				System.out.print(i);
				i++;
				if(i>'Z') break;			//do while문에 더 적합한 알고리즘
			}
			System.out.println();
		}
		
		
		
		// ◆ 다이아몬드 ◆		
		System.out.println("\n\n◆ 다이아몬드 ◆\n");
		
		for(int i=0;i<10;i++) {
			for(int j=10;j>i;j--) System.out.print("　");
			for(int j=0;j<=i;j++) System.out.print("＊");
			for(int j=0;j<=i;j++) System.out.print("＊");
			for(int j=10;j>i;j--) System.out.print("　");
			System.out.println();
		}

		for(int i=1;i<10;i++) {
			for(int j=0;j<=i;j++) System.out.print("　");
			for(int j=10;j>i;j--) System.out.print("＊");
			for(int j=10;j>i;j--) System.out.print("＊");
			for(int j=0;j<=i;j++) System.out.print("　");
			System.out.println();
		}
		
		System.out.println();
		
	}
}
