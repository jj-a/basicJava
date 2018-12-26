package oop1115;

public class OperatorTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OperatorTest2 ]"+"\n");
		
		
		// lab1. 지폐 장수 구하기
		// 출력결과> 만원 5장 천원 6장 ...
		System.out.println("[lab1] 지폐 장수 구하기 (56430원)");
		
		int money=56430;
		//int cng=money;
		double cnt4=money*0.0001;
		double cnt3=money%10000*0.001;
		double cnt2=money%1000*0.01;
		double cnt1=money%100*0.1;

		
		System.out.println("만원 "+(int)cnt4+"장");
		System.out.println("천원 "+(int)cnt3+"장");
		System.out.println("백원 "+(int)cnt2+"장");
		System.out.println("십원 "+(int)cnt1+"장");
		
		
		System.out.println();
		
		// lab2. 365.2422(...)일
		// 출력결과> 365일 ?시간 ?분 ?초
		System.out.println("[lab2] 1년 계산하기 (365.2422일)");
		
		double oneyear=365.2422; 
		
		double day=oneyear;
		double hour=oneyear%(int)oneyear*24;
		double min=hour%(int)hour*60;
		double sec=min%(int)min*60;
		
		System.out.print((int)day+"일 ");
		System.out.print((int)hour+"시간 ");
		System.out.print((int)min+"분 ");
		System.out.println((int)sec+"초");
		
		System.out.println("검산 = "+day+(hour+(min+sec*60)*60)*24);
		
	}
}
