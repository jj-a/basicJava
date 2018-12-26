package oop1115;

public class OperatorTest3 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OperatorTest3 ]"+"\n");
		
		
		int a=4;
		System.out.println(a%2==0);
		
		//System.out.println(a%0!=1);
		System.out.println();
		
		
		// lab1. 윤년 여부 확인
		System.out.println("[lab1] 윤년 확인하기");
		
		int year=2018;
		System.out.println(year+"년 윤년 여부: "+(year%4==0));
		System.out.println();
		
		
		// lab2. 임의의 수가 2의 배수이면서 5의 배수인지 여부
		System.out.println("[lab2] 2와 5의 공배수 여부");
		
		int b=15;
		
		System.out.println(b+" = "+((b%2==0)&&(b%5==0)));
		System.out.println();
		
		
		// lab3. 국어 점수가 80~89 사이인지 여부
		System.out.println("[lab3] 국어점수 80점대 여부");
		
		int kor=85;

		System.out.println((kor>=80)&&(kor<=89));
		System.out.println();
		
		
		// lab4. 치윤법이 적용된 윤년 계산
		System.out.println("[lab4] 치윤법 적용된 윤년 계산");
		
		year=2200;
		boolean leap=( year%4==0 && ( year%100!=0 || year%400==0 ) );
		//  4년마다 윤년,  100년 단위는 평년,  단 400년 단위는 윤년
		// year%4==0 && ( year%100!=0 || year%400==0 )
		
		System.out.println(year+"년 윤년여부: "+leap);
		System.out.println();
		
		
		// lab5. 임의의 문자가 알파벳 R, r 인지 여부
		System.out.println("[lab5] 알파벳 R(r) 여부 확인");
		
		char c='a';
		boolean result=c=='R'||c=='r';
		
		System.out.println(c+"= "+result);
		System.out.println();
		

		// lab5. 2의 배수이거나 3의 배수인지 여부
		System.out.println("[lab5] 2의 배수이거나 3의 배수인 수 찾기");
		
		int num=9;
		System.out.println(num+"= "+(num%2==0 || num%3==0));
		System.out.println();
		

		// lab6. 대문자 여부
		System.out.println("[lab6] 대문자 여부 확인");
		
		c='G';
		result=c>='A'&&c<='Z';
		
		System.out.println(c+"= "+result);
		System.out.println();
		

		// lab7. 3의 배수가 아닌 수 확인
		System.out.println("[lab7] 3의 배수가 아닌 수 => true");
		
		num=6;
		System.out.println(num+"= "+(num%3!=0));
		
		
		
	}
}
