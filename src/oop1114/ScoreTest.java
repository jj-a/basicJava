package oop1114;

public class ScoreTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ScoreTest ]"+"\n");
		
		String name="홍길동";
		int kor=80, eng=90, mat=95;
		
		int average=(kor+eng+mat)/3;
		char grade='B';
		
		System.out.println("이름: "+name);
		System.out.println();
		System.out.println("국어: "+kor+"점");
		System.out.println("영어: "+eng+"점");
		System.out.println("수학: "+mat+"점");
		System.out.println();
		System.out.println("평균: "+average+"점");
		System.out.println("학점: "+grade);
		
	}

}
