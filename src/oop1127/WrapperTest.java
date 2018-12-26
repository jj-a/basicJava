package oop1127;

public class WrapperTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - WrapperTest ]"+"\n");
		
		
		// Boolean Class
		System.out.println("\n- Boolean Class Method test");
		
		boolean flag=true;
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean("false");

		System.out.println(flag);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		
		// Byte Class
		System.out.println("\n- Byte Class Method test -");
		
		byte b=1;
		Byte bt=new Byte(b);
		System.out.println(b);
		System.out.println(bt.intValue());		// int형 변환
		System.out.println(bt.doubleValue());		// double형 변환
		
		
		// Integer Class
		System.out.println("\n- Integer Class Method test -");
		
		int n=3;
		Integer n1=new Integer(5);
		Integer n2=new Integer("7");
		System.out.println(n);
		System.out.println(n1.toString());
		System.out.println(n2.byteValue());
		
		System.out.print("Integer의 최소값 ~ 최대값 : ");
		System.out.println(Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);		// -(2^31) ~ (2^31)-1
		System.out.println("Integer의 메모리 할당량: "+Integer.SIZE);		// integer형 메모리 할당량(byte)
		System.out.println(Integer.parseInt("9"));	// String->int 형변환
		System.out.println(Integer.reverse(1));		// 2의 보수 방식으로 변환 (음수 표현)
		
		
		// Double Class
		System.out.println("\n- Double Class Method test -");
		
		// lab1. 실수형 값에서 정수만 더하기 (ex. 1.2 -> 1)
		System.out.println("[lab1] 실수형 값에서 정수만 더하기 (Double 클래스 메소드 이용)");
		double d=1.2;
		Double d1=new Double(3.4);
		Double d2=new Double("5.6");
		int sum;
		sum=(int)d+d1.intValue()+d2.intValue();
		System.out.println(sum);
		
		
		// Character Class
		System.out.println("\n- Character Class Method test -");
		
		char c='R';
		Character c1=new Character('B');
		System.out.println(c);
		System.out.println(c1.toString());
		
		// static: 프로그램 실행 즉시 메모리 할당되므로 별도의 선언 없이 (Class).(method) / (Class).(변수) 로 사용 가능
		
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isDigit('#'));
		System.out.println(Character.isUpperCase('e'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		// lab2. 대소문자 바꿔 출력
		System.out.println("\n[lab2] 대소문자 바꿔 출력하기 (Character 클래스 메소드 이용)");
		char ch[]= {'H','a','p','p','y'};
		
		for(int i=0;i<ch.length;i++) System.out.print(ch[i]);
		System.out.print(" => ");
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) ch[i]=Character.toLowerCase(ch[i]);
			else if(Character.isLowerCase(ch[i])) ch[i]=Character.toUpperCase(ch[i]);
		}
		
		for(int i=0;i<ch.length;i++) System.out.print(ch[i]);
		
		System.out.println();
		
		
	}
}
