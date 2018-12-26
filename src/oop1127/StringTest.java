package oop1127;

public class StringTest {
	public static void main(String[] args) {
		System.out.println("[ JJA - StringTest ]"+"\n");
		
		//String name="홍길동";
		String str=new String("Gone With The Wind");
		System.out.println("\" "+str.toString()+" \"");
		
		 System.out.print("\n- 문자열 길이: ");
		System.out.println(str.length());
		
		System.out.println("\n- 문자 순서");
		System.out.println("d = "+str.indexOf('d'));
		System.out.println("W = "+str.indexOf('W'));
		
		System.out.println("\n- n번째 문자 탐색");
		System.out.println("0번째 문자 = "+str.charAt(0));
		System.out.println("17번째 문자 = "+str.charAt(17));
		System.out.println("마지막 문자 = "+str.charAt(str.length()-1));
		
		System.out.print("\n- 빈 문자열 여부: ");
		System.out.println(str.isEmpty());
		
		System.out.println("\n- 알파벳 대소문자 변환");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("\n- 문자 치환");
		System.out.println(str.replace('n','N'));
		//System.out.println(str.replace('\n','<br>'));		// ex) web에서 활용
		
		System.out.println("\n- 문자열 나누기 (split) (csv)");
		String spl[]=str.split(" ");		// String.split(String s)
		for(int i=0;i<spl.length;i++) System.out.print("["+i+"] "+spl[i]+" / ");
		System.out.println();

		System.out.println("\n- 문자열 자르기 (substring)");
		System.out.println(str.substring(10,18));
		
		
		System.out.println(str.substring(0,str.indexOf(' '))+" "+str.substring(str.indexOf("Wind")));
		
		
		System.out.println("["+" P  h  o  to n  ".trim()+"]");
		
		
		
		// lab1. 이메일 주소에 @ 문자가 있는지 확인하고 @문자를 기준으로 문자열 분리
		System.out.println("\n[lab1] 이메일 주소 @를 기준으로 분리하기");
		
		String email="webmaster@soldesk.com";
		spl=new String[2];
		
		System.out.println("이메일: "+email.toString());
		
		if(email.indexOf('@')>0) spl=email.split("@");
		else {			// 오류 처리용
			spl[0]=" ";
			spl[1]=" ";
		}
		
		System.out.println("아이디: "+spl[0]);
		System.out.println("서버: "+spl[1]);
		
		
		
		// lab2. 주민번호로 성별, 나이, 누적합 구하기
		System.out.println("\n[lab2]  주민등록번호 연산");
		
		String id="8912301234567";
		char sex;
		int year, age;
		
		System.out.println("주민등록번호: "+id.substring(0,6)+"-"+id.substring(6,13));
		
		// 성별 확인
		sex= id.charAt(6);		// 7번째 숫자 코드 성별 정보에 저장 (char형)
		
		System.out.print("성별: ");
		if(sex=='1'||sex=='3') System.out.println("남자");
		else if(sex=='2'||sex=='4') System.out.println("여자");
		else System.out.println("오류");		// 오류 처리
		
		// 나이 계산
		if(sex=='1'||sex=='2') year=Integer.parseInt("19"+id.substring(0,2));		// 1900년대생
		else if(sex=='3'||sex=='4') year=Integer.parseInt("20"+id.substring(0,2));		// 2000년대생
		else year=0000;		// 오류 처리
		
		age=2018-year+1;
		System.out.println("나이: "+age);
		
		// 주민번호 숫자의 합
		int sum=0;
		
		for(int i=0;i<id.length();i++) {
			if(i>0) System.out.print("+");
			System.out.print(id.charAt(i));
			sum+=Integer.parseInt(String.valueOf(id.charAt(i)));		// char->String->int 형변환
			//sum+=Character.getNumericValue(id.charAt(i));		// char->int 형변환
		}
		/*	// substring() 이용
		for(int i=0;i<id.length();i++) {
			if(i>0) System.out.print("+");
			System.out.print(id.substring(i,i+1));		// substring() 이용
			sum+=Integer.parseInt(id.substring(i,i+1));		// String->int 형변환
		}
		*/
		
		System.out.println(" = "+sum);
		
		
	}
}
