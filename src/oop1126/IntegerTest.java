package oop1126;

public class IntegerTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - IntegerTest ]"+"\n");
		
		System.out.println(Integer.toBinaryString(13));	// 2진수
		System.out.println(Integer.toOctalString(13));		// 8진수
		System.out.println(Integer.toHexString(13));			// 16진수
		
		System.out.println(Integer.max(10,20));
		System.out.println(Integer.min(10,20));
		
		System.out.println(Integer.sum(10,20));

		String s="3";
		System.out.println(s+5);
		System.out.println(Integer.parseInt(s)+5);		// Integer.parseInt(String s) - integer 형변환
		
	}
}
