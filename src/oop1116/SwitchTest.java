package oop1116;

public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - SwitchTest ]"+"\n");
		
		int n=10;
		String s=null;
		
		switch(n) {
		case 10: s="SEOUL"; break;
		case 20: s="JEJU"; break;
		case 30: s="BUSAN"; break;
		default: s="etc";
		}
		
		System.out.println(s);
		System.out.println();
		

		// lab1. 국어등급 산정
		// 국어 90점대 A / 80점대 B / 70점대 C / 60점대 D / 50점 이하 F
		System.out.println("[lab1] 국어등급 확인");
		
		int kor=85;
		char grade;
		
		System.out.println("국어 점수: "+kor);
		
		switch(kor/10) {
		case 10: case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default: grade='F';
		}
		
		System.out.println("국어 등급: "+grade);
		System.out.println();
		
		
		// lab2. 간단 계산기 프로그램
		System.out.println("[lab2] 간단 계산기 프로그램");
		
		int a=3, b=5;
		char op='/';
		
		System.out.print(a+" "+op+" "+b+" = ");
		
		switch(op) {
		case '+': System.out.println(a+b); break;
		case '-': System.out.println(a-b); break;
		case '*': System.out.println(a*b); break;
		case '/': System.out.println((double)a/b); break;
		case '%': System.out.println(a%b); break;
		}
		
		System.out.println();
		
		
		// lab3. 성별코드로 성별 구분과 나이 구하기 (1,3,5=남자 / 2,4,6=여자)
		// 1900년대 주민번호 성별코드 1,2  /  2000년~ 주민등록번호 성별코드 3,4 / 외국인 5,6
		System.out.println("[lab3] 주민번호의 성별 코드로 성별 구분 + 나이 알아보기");
		int x=4;
		int birthyy=15;
		int birthyyyy=0, age=0;
		String resultstr;
		
		System.out.println("x="+x+" birthyy="+birthyy);
		
		switch(x) {
		case 1: case 3: case 5: resultstr="남성"; break;
		case 2: case 4: case 6: resultstr="여성"; break;
		default: resultstr="표기 오류";
		}
		
		System.out.println("해당 코드는 ["+resultstr+"]입니다.");
		
		switch((x+1)/2) {
		case 1: birthyyyy=1900+birthyy; break;
		case 2: birthyyyy=2000+birthyy; break;
		default: System.out.println("외국인 (계산불가)");
		}
		
		age=2018-birthyyyy+1;		// 한국나이 기준
		
		System.out.print("생년: "+birthyyyy+"년 / ");
		System.out.println("나이: "+age+"세");
		
		
		System.out.println();
		
		
		
	}
}
