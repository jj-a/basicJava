package oop1116;

public class OperatorTest6 {
	public static void main(String[] args) {

		System.out.println("[ JJA - OperatorTest6 ]"+"\n");
		
		
		// 삼항연산자
		
		// lab1. 음수/양수 여부
		System.out.println("[lab1] 음수/양수 여부 확인");
		
		int x=9;
		System.out.println("x="+x);
		String result = (x>=0) ? "양수" : "음수";
		System.out.println(x+"은(는) "+result+"입니다.");
		System.out.println();
		
		
		// lab2. 짝수/홀수 여부
		System.out.println("[lab2] 짝수/홀수 여부 확인");

		x=21;
		System.out.println("x="+x);
		result= (x%2==0) ? "짝수" : "홀수";
		System.out.println(x+"은(는) "+result+"입니다.");
		System.out.println();
		
		
		// lab3. 2와 5의 공배수 여부
		System.out.println("[lab3] 2와 5의 공배수 여부 확인");

		x=30;
		System.out.println("x="+x);
		result= (x%2==0&&x%5==0) ? "2와 5의 공배수입" : "2와 5의 공배수가 아닙";
		System.out.println(x+"은(는) "+result+"니다.");
		System.out.println();
		
		
		// lab4. 윤년/평년 여부
		System.out.println("[lab4] 윤년/평년 여부 확인");

		x=2100;
		System.out.println("x="+x+"(년)");
		result= ((x%4==0)&&(x%100!=0||x%400==0)) ? "윤년" : "평년";
		System.out.println(x+"년은 "+result+"입니다.");
		System.out.println();
		
		
		// lab5. 대소문자 바꿔 출력
		System.out.println("[lab5] 알파벳 대소문자 바꿔 출력");

		char c='a';
		System.out.println("c= "+c);
		result= (c<'a') ? (char)(c+32)+"" : (char)(c-32)+"";
		System.out.println(c+" => "+result);
		System.out.println();
		
		
		// lab6. 최대값 출력
		System.out.println("[lab6] 최대값 찾기");

		int y,z;
		x=3;
		y=9;
		z=7;
		
		System.out.println("x="+x+" y="+y+" z="+z);
		int max= (x>y&&x>z) ? x : (y>z ? y : z);
		System.out.println("최대값은 "+max+"입니다.");
		System.out.println();
		
		
		
	}
}
