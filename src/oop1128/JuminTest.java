package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JuminTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - JuminTest ]"+"\n");
		
		// lab1. 주민번호가 유효한지 검증하고 정보 출력
		//	출력정보> 성별, 나이, 띠, 살아온 날짜
		System.out.println("[lab1] 주민번호의 유효 여부 & 정보 출력");
		
		Jumin p=new Jumin("9011231234567");
		Jumin p1=new Jumin("9301052000005");		// 뒷번호 가공O
		Jumin p2=new Jumin("1801014091237");
		
		// 유효검사
		System.out.println("\n<test1>");
		p.display();	
		System.out.println("\n<내꺼>");
		p1.display();	
		System.out.println("\n<test2>");
		p2.display();	
		
		
	}
}		// ------------- main

class Jumin{
	
	private String id;
	private char gender;
	private int year, age;
	
	
	public Jumin(String id) {		// id, year, age, gender 초기화
		this.id=id;
		checkGender();
		checkAge();
	}
	
	public Jumin() {		// default
		;
	}
	
	
	public void display() {	// *** 출력 폼 ***
		System.out.println("주민등록번호: "+id.substring(0,6)+" - "+gender+"******");
		checkID();
		if(validate()==true) {
			System.out.println("-------------");
			System.out.println("성별: "+isFemale());
			System.out.println("나이: "+age);
			System.out.println("띠: "+yearOf()+"띠");
			System.out.println("살아온 날: "+liveDay()+"일");
		}
	}
	
	
	public void checkID() {		// 번호 유효여부 출력
		String result;
		if(validate()==true) result="유효함";
		else result="유효하지 않음";
		System.out.println("주민등록번호 검증 결과 : "+result);
	}
	
	
	private boolean validate() {		// ** 주민등록번호 유효 여부 체크 **
		// Logic: 주민등록번호가 ABCDEF-GHIJKLM 이라고 가정했을 때
		// M = (11-((A*2+B*3+C*4+D*5+E*6+F*7+G*8+H*9+I*2+J*3+K*4+L*5)%11))%10
		
		boolean flag=false;
		int check;
		int lastcode=Character.getNumericValue(id.charAt(12));

		check=(11-(checkSum()%11))%10;
		
		//System.out.println("*1~13번째 코드 합: "+checkSum());
		//System.out.println("*계산숫자 / 오류검증번호: "+check+" / "+lastcode);
		
		if(check==lastcode) flag=true;		// 주민등록번호가 유효할 때
		
		return flag;
	}
	
	
	private int checkSum() {		// 마지막 숫자(14번째 코드) 제외하고 1~13번째 숫자 합
		int sum=0;
		int x[]= {2,3,4,5,6,7,8,9,2,3,4,5};	// 곱번호
		
		for(int i=0;i<id.length()-1;i++) {
			sum+=Character.getNumericValue(id.charAt(i))*x[i];		// char->int 형변환
		}
		
		return sum;
	}

	
	public int sumID() {		// 전체 코드(숫자)의 합  // 사용되지 않은 메소드
		int sum=0;
		
		for(int i=0;i<id.length();i++) {
			if(i>0) System.out.print("+");
			System.out.print(id.charAt(i));
			sum+=Character.getNumericValue(id.charAt(i));		// char->int 형변환
		}
		
		return sum;
	}
	
	
	private String isFemale() {		// 성별 확인
		if(gender=='1'||gender=='3') return "남자";
		else if(gender=='2'||gender=='4') return "여자";
		else  return "오류";		// 오류 처리
	}
	
	
	private void checkGender() {		// 성별 저장
		gender= id.charAt(6);
	}
	
	
	private void checkAge() {		// 생년&나이 저장
		if(gender=='1'||gender=='2') year=Integer.parseInt("19"+id.substring(0,2));		// 1900년대생
		else if(gender=='3'||gender=='4') year=Integer.parseInt("20"+id.substring(0,2));		// 2000년대생
		else year=0000;		// 오류 처리
		Calendar cal=Calendar.getInstance();
		age=cal.get(Calendar.YEAR)-year+1;
	}
	
	
	private String yearOf() {		// 띠 확인 (자축인묘진사오미신유술해)
		String str;
		
		int code=year%12;
		int birthday=Integer.parseInt(id.substring(2,6)); 
		if(birthday<0204) code--;		// 빠른생일(입춘 전 생일) 처리
		
		switch(code){
			case 0: str="원숭이"; break;
			case 1: str="닭"; break;
			case 2: str="개"; break;
			case 3: str="돼지"; break;
			case 4: str="쥐"; break;
			case 5: str="소"; break;
			case 6: str="호랑이"; break;
			case 7: str="토끼"; break;
			case 8: str="용"; break;
			case 9: str="뱀"; break;
			case 10: str="말"; break;
			case 11: str="양"; break;
			default: str="";
		}
		
		return str;
	}
	
	
	private int liveDay(){		// 살아온 날
		
		int birthmm,birthdd;
		int currentyear;
		
		birthmm=Integer.parseInt(id.substring(2,4));
		birthdd=Integer.parseInt(id.substring(4,6));

		GregorianCalendar chkyear=new GregorianCalendar();
		currentyear=chkyear.get(Calendar.YEAR);		// 현재년도

		// 월별 일수
		int mday[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(chkyear.isLeapYear(currentyear)) mday[2]=29;		//윤달
		
		// 날짜수 누적 변수
		int totallive=0;
		
		/*
		 * 		<경우의 수>
		 * 1) 올해 생일인 경우 (다른 달)	----------------(구현중)
		 * 		1-1) 월단위 일수 계산 (태어난 다음달~전달)
		 * 		1-2) 태어난달 일수 계산 (태어난날~말일)
		 * 		1-3) 이번달 일수 계산 (1일~오늘)
		 * 2) 올해 이번달 생일인 경우		----------------(검증x)
		 * 		2-1) 태어난날~오늘
		 * 3) 올해 생일이 아닌 경우			----------------(완료)
		 * 		3-1) 올해-이번달 일수 계산 (1일~오늘)
		 * 		3-2) 올해-월단위 일수 계산 (1월~전달)
		 * 		3-3) 태어난해 다음해~전년도-년단위 일수 계산
		 * 		3-4) 태어난해-태어난달 일수 계산 (태어난날~말일)
		 * 		3-5) 태어난해-월단위 일수 계산 (태어난 다음달~12월)
		 */

		// 1) 이번달 일수 계산
		if(currentyear!=year) {		// 올해 태어난 사람은 계산 제외
			totallive+=chkyear.get(Calendar.DATE);
		}
		
		// 2) 올해 월단위 일수 계산 (이번달 제외)
		for(int i=1;i<chkyear.get(Calendar.MONTH)+1;i++) {
			totallive+=mday[i-1];
		}
			
		
		// 3) 년단위 일수 계산 (태어난 년도 다음해 ~ 전년도)
		for(int i=year+1;i<currentyear;i++) {
			if(chkyear.isLeapYear(i)) {	//윤년
				totallive+=366;
			}
			else {
				totallive+=365;
			}
		}
		
		// 4) 태어난 달 일수 계산
		totallive+=mday[birthmm-1]-birthdd+1;
		
		// 5) 태어난 년도의 월단위 일수 계산 (태어난 달 제외)
		if(currentyear!=year) {		// 올해 태어난 사람은 계산 제외
			for(int i=12;i>birthmm;i--) {
				totallive+=mday[i-1];
			}
		}

		return totallive;
		
	}
	
	
}


