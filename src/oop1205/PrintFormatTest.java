package oop1205;
/*
 *  입출력 자료형 포맷
 *  
 *  %d : 정수형 (digit)		- %[n]d : [간격 조절]	ex. %3d / %-3d / %03d (마이너스는 뒷간격 조절, 0n은 숫자포맷을 ##로)
 *  %f : 실수형 (float)		- %[n.m]F : [간격 조절.소수점 자리수 조절]	ex. %5.2f / %-3.0f
 *  %c : character형			- %[n]c : [간격 조절]
 *  %s : string형				- %[n]s : [간격 조절]
 *  \n : 행(줄)바꿈
 *  
 */
public class PrintFormatTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - PrintFormatTest ]"+"\n");
		
		int a=10;
		String str="HELLO";
		
		System.out.printf("정수형: %d %d %5d",a,20,30);
		System.out.printf("\n실수형: %-9.3f$",(float)a);
		System.out.printf("\n문자형: %c %c %c",'a','b','c');
		System.out.printf("\n문자열형: %-10s %s",str,"Photon");
		
		
	}
}
