package oop1116;

public class IfTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - IfTest ]"+"\n");
		
		int x=0, y=0;
		String resultstr;
		int result;
		
		// lab1. 음수/양수/0 여부
		System.out.println("[lab1] 음수/양수/0 여부 확인");
		
		x=0;
		System.out.println("x="+x);
		
		
		if(x>0) resultstr="양수";
		else if(x<0) resultstr="음수";
		else resultstr="0";

		System.out.println("x는 ["+resultstr+"]입니다.");
		System.out.println();

		
		// lab2. 절대값 출력
		System.out.println("[lab2] 절대값 출력하기");
		
		x=-11;
		System.out.println("x="+x);
		
		if(x<0) result=-x;
		else result=x;
		
		System.out.println(x+"의 절대값은 ["+result+"]입니다.");
		System.out.println();
		
		
		// lab3. 두 수의 차이
		System.out.println("[lab3] 두 수의 차이 구하기");
		x=5;
		y=9;
		
		System.out.println("x="+x+" y="+y);
		
		if(x>y) result=x-y;
		else result=y-x;
		
		System.out.println("두 수의 차이는 ["+result+"]입니다.");
		System.out.println();
		
		
		// lab4. 성별코드로 성별 구분 (1,3,5=남자 / 2,4,6=여자)
		System.out.println("[lab4] 주민번호의 성별 코드로 성별 구분");
		x=2;
		
		System.out.println("x="+x);
		
		if(x==1||x==3||x==5) resultstr="남성";
		else if(x==2||x==4||x==6) resultstr="여성";
		else resultstr="표기 오류";
		
		System.out.println("해당 코드는 ["+resultstr+"]입니다.");
		System.out.println();
		
		 
		
		
	}
}
