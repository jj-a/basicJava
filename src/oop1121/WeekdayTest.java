package oop1121;

public class WeekdayTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - WeekdayTest ]"+"\n");
		
		// lab1. 요일 구하는 프로그램
		// 입력> 2018-11-21	출력> 수요일
		
		int todayyyyy=2018, todaymm=11, todaydd=21;
		
		String week[]={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		// 0일 1월 2화 3수 4목 5금 6토  / 1년 1월 1일 = 월요일
		
		// 날짜수 누적 & 일단위 날짜수 계산
		int totalday=todaydd;
		
		// todayyyy 연도에 해당하는 월별 날짜수
		int mday[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		if(todayyyyy%4==0&&(todayyyyy%100!=0||todayyyyy%400==0)) mday[2]=29;		//윤년
		
		// 년단위 날짜수 계산
		for(int i=1;i<todayyyyy;i++) {
			if(i%4==0&&(i%100!=0||i%400==0)) {	//윤년
				totalday+=366;
			}
			else {
				totalday+=365;
			}
		}
		
		// 월단위 날짜수 계산
		for(int i=1;i<todaymm;i++) {
			totalday+=mday[i-1];
		}
		
		System.out.println("0001년 01월 01일 ~ "+todayyyyy+"년 "+todaymm+"월 "+todaydd+"일");
		System.out.println("총 일자: "+totalday+"일");
		System.out.println(todayyyyy+"년 "+todaymm+"월 "+todaydd+"일 = "+week[totalday%7]);
		
		
		
		
		// lab2. 살아온 총 날짜
		/////////하는중

		int birthyyyy=1993,birthmm=1,birthdd=5;
		
		// 날짜수 누적 & 일단위 날짜수 계산
		int totallive=birthdd;
		
		// todayyyy 연도에 해당하는 월별 날짜수
		if(birthyyyy%4==0&&(birthyyyy%100!=0||birthyyyy%400==0)) mday[2]=29;		//윤년
		
		// 년단위 날짜수 계산
		for(int i=1;i<todayyyyy;i++) {
			if(i%4==0&&(i%100!=0||i%400==0)) {	//윤년
				totallive+=366;
			}
			else {
				totallive+=365;
			}
		}
		
		// 월단위 날짜수 계산
		for(int i=1;i<birthmm;i++) {
			totallive+=mday[i-1];
		}
		
		System.out.println("0001년 01월 01일 ~ "+todayyyyy+"년 "+todaymm+"월 "+todaydd+"일");
		System.out.println("총 일자: "+totallive+"일");
		System.out.println(todayyyyy+"년 "+todaymm+"월 "+todaydd+"일 = "+week[totalday%7]);
		
		
		
		
		
	}
}
