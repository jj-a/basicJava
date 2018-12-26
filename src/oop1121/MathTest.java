package oop1121;

public class MathTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - MathTest ]"+"\n");
		
		System.out.println("Math class method"+"\n");
		
		// 절대값
		System.out.println("절대값(abs) : "+Math.abs(-3));
		System.out.println("절대값(abs) : "+Math.abs(5));
		
		// 최대값, 최소값
		System.out.println("최대값(max) : "+Math.max(2,4));
		System.out.println("최소값(min) : "+Math.min(2,4));
		System.out.println("최대값(max) : "+Math.max(7,Math.max(8,9)));
		
		// 소수점 처리 (올림/내림/반올림)
		System.out.println("올림(ceil) : "+Math.ceil(1.3));
		System.out.println("내림(절사)(floor) : "+Math.floor(2.7));
		System.out.println("반올림(round) : "+Math.round(3.8));
		
		// 파이(π)
		System.out.println("파이(PI) : π = "+Math.PI);
		

		// 난수 (Math.random)
		System.out.println("난수 생성(random)▼");
		for(int i=0;i<50;i++) {
			System.out.print((int)(Math.random()*10)+1+" ");
		}
		
		//  **참고**  Java 난수 생성 방식  (ex. 1~10의 난수 발생)
		//  1)  Math.random 메소드(실수 double형) 이용 - Math.random()*10+1
		//  2)  Random 클래스 (정수 long형) 이용 -  Random 객체 생성 후 (ex. random) random.nextInt(10)+1
		
		// Math.random() 난수 발생 범위: 기본값 double형(8bit) 0.0 ~ 1.0
		// Random.nextInt() 난수 발생 범위: Int형(4bit) 0 ~ 입력값a-1 사이
		
	}
}
