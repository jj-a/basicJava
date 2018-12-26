package oop1115;

public class ConversionTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ConversionTest ]"+"\n");
		
		// 자동 형변환
		
		byte a=3;
		int b=a;
		long c=b;
		double d=c;
		
		
		System.out.println("byte형 = "+a);
		System.out.println("byte->int 형변환 = "+b);
		System.out.println("int->long 형변환 = "+c);
		System.out.println("long->double 형변환 = "+d);
		System.out.println();
		
		float f=4.5f;
		double g=f;

		System.out.println("float형 = "+f);
		System.out.println("float->double 형변환 = "+g);
		System.out.println();
		
		
		// 강제 형변환 (Cast)
		
		System.out.println((int)3.5);
		System.out.println((double)4);
		System.out.println((int)3.6+(int)4.7);
		System.out.println((int)(3.6+4.7));
		System.out.println();
		
		
		//형변환 예제
		
		int kor=80, eng=90, mat=75;
		
		double avr1=(kor+eng+mat)/3;
		double avr2=(kor+eng+mat)/3.0;
		double avr3=(double)(kor+eng+mat)/3;
		
		System.out.println(avr1);
		System.out.println(avr2);
		System.out.println(avr3);
		
		
	}
}
