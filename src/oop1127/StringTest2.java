package oop1127;

import java.util.StringTokenizer;

/*
 * 
 *  [ String / StringBuffer / StringBuilder 클래스 차이 ]
 *  
 *  공통사항: 문자열 연산 클래스
 *  
 *  1) String: immutable(불변) - 문자열 변화 시 새로운 객체(메모리공간)를 생성 (overhead 발생)
 *  					단순 조회 시 빠르게 읽을 수 있음
 *  					equals() overriding됨
 *  				= 연산이 적고 조회가 많은 멀티쓰레드 환경에서 사용 용이
 *  
 *  2) StringBuffer: mutable(가변) - 문자열 변화 시 메모리 크기 변경
 *  								synchronized(동기화) 가능 => thread-safe
 *  								equals() overriding 없음
 *  							= 연산이 많고 멀티쓰레드 환경일 때 사용 용이
 *  
 *  3) StringBuilder: mutable(가변) - 문자열 변화 시 메모리 크기 변경
 *  								synchronized(동기화) 미지원 => StringBuffer에 비해 연산 처리가 빠름
 *  								equals() overriding 없음
 *  							= 연산이 많고 쓰레드와 무관한 환경에서 사용 용이
 *  
 *  응답시간: String > StringBuilder > StringBuffer
 *  메모리: String > StringBuilder = StringBuilder
 *  
 */

public class StringTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - StringTest2 ]"+"\n");
		
		
		// String형
		
		String str="";
		
		// 연산
		str+="one";
		str+="two";
		str+="three";
		System.out.println("1) String 값: "+"[ "+str+" ]");
		System.out.println("     String 길이: "+str.length());
		System.out.println("     Hash code: "+System.identityHashCode(str));
		
		str="";		// 초기화
		System.out.println("2) 초기화 후 String 값: "+"[ "+str+" ]");	// 없음
		System.out.println("     String 길이: "+str.length());
		System.out.println("     Hash code: "+System.identityHashCode(str));	// hashcode가 다름 (새로운 메모리 할당)
		
		str+="four";		// 연산
		System.out.println("3) 재할당 후 String 값: "+"[ "+str+" ]");	// 없음
		System.out.println("     String 길이: "+str.length());
		System.out.println("     Hash code: "+System.identityHashCode(str));	// hashcode가 계속 바뀜
		
		System.out.println();
		
		
		// StringBuffer형
		
		StringBuffer sb=new StringBuffer("");
		
		// 연산
		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println("4) StringBuffer 값: "+"[ "+sb.toString()+" ]");
		System.out.println("     StringBuffer 길이: "+sb.length());
		System.out.println("     Hash code: "+System.identityHashCode(sb));
		
		sb.delete(0,sb.length());		// 초기화
		System.out.println("5) 초기화 후 StringBuffer 값: "+"[ "+sb.toString()+" ]");	// 없음
		System.out.println("     StringBuffer 길이: "+sb.length());
		System.out.println("     Hash code: "+System.identityHashCode(sb));	// hashcode가 같음 (같은 메모리 내에서 변경)
		
		sb.append("four");		// 연산
		System.out.println("6) 재할당 후 StringBuffer 값: "+"[ "+sb.toString()+" ]");	// 없음
		System.out.println("     StringBuffer 길이: "+sb.length());
		System.out.println("     Hash code: "+System.identityHashCode(sb));	// hashcode가 계속 동일
		
		System.out.println();
		
		
		// split 연산 클래스 - StringTokenizer
		System.out.println("StringTokenizer 클래스");
		
		String namestr="kim,lee,park";
		//StringTokenizer st=new StringTokenizer(namestr);		// default 구분자 = 공백(" ")
		StringTokenizer st=new StringTokenizer(namestr,",");
		
		System.out.print(namestr.toString()+" => ");
		
		while(st.hasMoreTokens()) {		// 설정한 구분자(,)가 남아있는지 여부 (boolean)
			String word=st.nextToken();
			System.out.print(word+" / ");
		}
		
		str="Gone With The Wind";
		StringTokenizer st2=new StringTokenizer(str);
		
		System.out.print("\n"+str.toString()+" => ");
		
		while(st2.hasMoreTokens()) {		// 설정한 구분자( )가 남아있는지 여부 (boolean)
			String word=st2.nextToken();
			System.out.print(word+" / ");
		}
		
	}
}
