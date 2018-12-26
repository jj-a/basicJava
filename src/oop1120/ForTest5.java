package oop1120;

public class ForTest5 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest5 ]"+"\n");
		
		int i=0, j=0;
		for(i=1;i<=2;i++) {
			for(j=1;j<=3;j++) {
				System.out.print("jsp");
			}
			System.out.println("java");
		}
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);

		
		//★구구단★
		System.out.println("\n\n[구구단]");
		
		for(i=2;i<=9;i++) {
			System.out.print(i+"단> ");
			for(j=1;j<=9;j++) System.out.print(i+"*"+j+"="+i*j+"  ");
			System.out.println();
		}
		
		
		System.out.println();
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		// ◆ 다이아몬드 ◆		
		System.out.println("\n\n◆ 다이아몬드 ◆\n");
		
		for(i=0;i<10;i++) {
			for(j=10;j>i;j--) System.out.print("　");
			for(j=0;j<=i;j++) System.out.print("＊");
			for(j=0;j<=i;j++) System.out.print("＊");
			for(j=10;j>i;j--) System.out.print("　");
			System.out.println();
		}

		for(i=1;i<10;i++) {
			for(j=0;j<=i;j++) System.out.print("　");
			for(j=10;j>i;j--) System.out.print("＊");
			for(j=10;j>i;j--) System.out.print("＊");
			for(j=0;j<=i;j++) System.out.print("　");
			System.out.println();
		}
		
		
		// 문자 출력 연습하기
		System.out.println("\n\n[문자 출력 연습 (n*n마다 @출력)]");
		
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(i==j) System.out.print("@");
				else System.out.print("#");
			}
			System.out.println();
		}

		
		// 숫자 출력 연습하기
		System.out.println("\n\n[숫자 출력 연습 (숫자 하나씩 밀어 출력)]");
		
		for(i=1;i<=5;i++) {
			for(j=i;j<i+5;j++) System.out.print(j);
			System.out.println();
		}
		

		// ♣ 바람개비 ♣		
		System.out.println("\n\n♣ 바람개비 ♣\n");
		
		for(i=0;i<10;i++) {
			for(j=0;j<=i;j++) System.out.print("＊");
			for(j=9;j>i;j--) System.out.print("　");
			for(j=10;j>i;j--) System.out.print("＊");
			for(j=1;j<=i;j++) System.out.print("　");
			System.out.println();
		}

		for(i=0;i<10;i++) {
			for(j=9;j>i;j--) System.out.print("　");
			for(j=0;j<=i;j++) System.out.print("＊");
			for(j=1;j<=i;j++) System.out.print("　");
			for(j=10;j>i;j--) System.out.print("＊");
			System.out.println();
		}
		
		System.out.println();

	}
}
