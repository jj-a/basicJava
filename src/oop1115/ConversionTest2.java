package oop1115;

public class ConversionTest2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ConversionTest2 ]"+"\n");
		
		
		// 정수<->문자 형변환 (ASCII)
		
		System.out.println(65);
		System.out.println();
		
		System.out.println("65->char->"+(char)65);		//아스키코드
		System.out.println("66->char->"+(char)66);
		System.out.println("67->char->"+(char)67);
		System.out.println();

		System.out.println("97->char->"+(char)97);
		System.out.println("98->char->"+(char)98);
		System.out.println("99->char->"+(char)99);
		System.out.println();
		
		System.out.println("A < a = "+('A'<'a'));
		System.out.print('A');
		System.out.println("="+(int)'A');
		System.out.print('a');
		System.out.println("="+(int)'a');
		System.out.println();

		System.out.print((int)'+'+" = ");
		System.out.println((char)43);
		System.out.print((int)'\r'+" = ");		// enter		-> **jar파일 실행시 출력안됨 확인
		System.out.println((char)13+"(Enter)");
		System.out.print((int)' '+" = ");		// space
		System.out.println((char)32+"(Space)");
		
		
		
		// lab1. 대소문자를 서로 바꾸어 출력하기 (M->m, n->N)
		System.out.println("\n대소문자 변환하여 출력");
		
		char ch1='M';
		char ch2='n';
		int jump=32;
		
		System.out.print(ch1+" -> ");
		if(ch1<=90) System.out.println(ch1+=jump);
		else	 System.out.println(ch1-=jump);
		
		System.out.print(ch2+" -> ");
		if(ch2<=90) System.out.println(ch2+=jump);
		else	 System.out.println(ch2-=jump);
		
		
		
		// lab2. 간단 계산기능 구현
		System.out.println("\n간단 계산기능 구현");
		
		int a=3;
		int b=5;
		char op='+';
		
		System.out.println(a+""+op+""+b+"="+(a+b));
		
		
	}
}
