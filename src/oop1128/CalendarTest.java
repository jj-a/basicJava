package oop1128;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - CarlendarTest ]"+"\n");
		
		
		// 현재 시스템 날짜 정보
		Calendar cal=Calendar.getInstance();		// Calendar 클래스 cal에 날짜정보 받아오기
		
		System.out.println(cal);
		System.out.println(cal.getTime());
		
		for(int i=0;i<17;i++) System.out.print(cal.get(i)+" / ");
		/*
		 *	Calendar field info  - Calendar.get(n)
		 *
		[0] ERA
		[1] YEAR
		[2] MONTH
		[3] WEEK_OF_YEAR
		[4] WEEK_OF_MONTH
		[5] DAY_OF_MONTH
		[6] DAY_OF_YEAR
		[7] DAY_OF_WEEK
		[8] DAY_OF_WEEK_IN_MONTH
		[9] AM_PM
		[10] HOUR
		[11] HOUR_OF_DAY
		[12] MINUTE
		[13] SECOND
		[14] MILLISECOND
		[15] ZONE_OFFSET
		[16] DST_OFFSET
		 * 
		 */
		
		System.out.println();
		System.out.println("년도: "+cal.get(Calendar.YEAR)+"년 ");		// Calendar.YEAR = 1
		System.out.print("일자: "+(cal.get(Calendar.MONTH)+1)+"월 ");		// Calendar.YEAR = 1
		System.out.println(cal.get(Calendar.DATE)+"일 ");		// Calendar.YEAR = 1
		System.out.print("시간: "+cal.get(Calendar.HOUR)+"시 ");		// Calendar.YEAR = 1
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");		// Calendar.YEAR = 1
		System.out.println(cal.get(Calendar.SECOND)+"초 ");		// Calendar.YEAR = 1
		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK));		// Calendar.YEAR = 1
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));		// Calendar.YEAR = 1
		System.out.println("24시 기준: "+cal.get(Calendar.HOUR_OF_DAY)+"시 "+cal.get(Calendar.MINUTE)+"분 ");		// Calendar.YEAR = 1
		
		cal.set(1989,11,29);		// 1989.12.29 (1~12월 = 0~11)
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"월 ");	// 결과값에서 +1 해줘야함
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		cal.set(Calendar.YEAR,2018);
		cal.set(Calendar.MONTH,Calendar.NOVEMBER);	// Calendar.NOVEMBER = 11 (월 그대로 반환) → 12월 자리로 set됨 (0~11)
		cal.set(Calendar.DATE,15);
		System.out.println(cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일");
		
		
		GregorianCalendar cal2=new GregorianCalendar();
		System.out.print("2018년 = ");
		if(cal2.isLeapYear(2018)) System.out.println("윤년");
		else System.out.println("평년");
		
		 cal2=new GregorianCalendar(1989,11,31);	// 1989.12.31
		 System.out.print(cal2.get(Calendar.YEAR)+"년 ");
		 System.out.print((cal2.get(Calendar.MONTH)+1)+"월 ");
		 System.out.println(cal2.get(Calendar.DATE)+"일");
		
		
	}
}
