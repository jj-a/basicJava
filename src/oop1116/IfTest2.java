package oop1116;

public class IfTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - IfTest2 ]"+"\n");
		
		// 성적프로그램
		
		String name="홍길동";
		int kor=85, eng=35, mat=90;
		int avr=(kor+eng+mat)/3;
		
		
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+mat);
		System.out.println("평균: "+avr);
		System.out.println();
		
		
		// lab1.평균 95이상 장학생 선정
		System.out.println("[lab1] 장학생 선정");
		
		if(avr>=95) System.out.println(name+"님은 장학생입니다.");
		else System.out.println(name+"님은 장학생 대상이 아닙니다.");
		System.out.println();
		
		
		// lab2. 국어등급 산정
		// 국어 90점대 A / 80점대 B / 70점대 C / 60점대 D / 50점 이하 F
		System.out.println("[lab2] 국어등급 확인");

		char grade;
			
		if(kor>=90) grade='A';
		else if(kor>=80) grade='B';
		else if(kor>=70) grade='C';
		else if(kor>=60) grade='D';
		else grade='F';
		
		System.out.println(name+"님의 국어 등급: "+grade);
		System.out.println();
		
		
		// lab3. 과락 체크하기
		// 평균 70점 이상 합격, 단 1과목이라도 40점 미만일 시 재시험, 평균 70점 미만 불합격
		System.out.println("[lab3] 합격여부 체크하기 (합격/재시험/불합격)");
		
		String result;
		
		if(avr>=70) {
			/*
			if(kor<40||eng<40||mat<40) result="재시험";
			else result="합격";
			*/
			
			if(kor>=40&&eng>=40&&mat>=40) result="합격";
			else result="재시험";
			
		}
		else result="불합격";

		System.out.println(name+"님은 "+result+"입니다.");
		System.out.println();
		
		
		// lab4. 간단 계산기 프로그램
		System.out.println("[lab4] 간단 계산기 프로그램");
		
		int a=3, b=5;
		char op='/';
		
		System.out.print(a+" "+op+" "+b+" = ");
		
		if(op=='+') System.out.println(a+b);
		else if(op=='-') System.out.println(a-b);
		else if(op=='*') System.out.println(a*b);
		else if(op=='/') System.out.println((double)a/b);
		else if(op=='%') System.out.println(a%b);

		System.out.println();
		
		
		
	}
}
