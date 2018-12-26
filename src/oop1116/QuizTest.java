package oop1116;

public class QuizTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - QuizTest ]"+"\n");
		
		// homework. 운행거리에 따라 택시 요금을 계산하는 프로그램
		// ~2000m 기본요금 900원 / 2000m초과 200m단위마다 기본요금+100원 가산
		// 출력결과> 운행거리: 3000  요금: ?
		System.out.println("[homework/11.16] 운행거리에 따라 택시 요금 계산");
		
		int m=3000;
		int fare=0;
		
		if(m<=2000) fare=900;
		else if(m>2000) fare=900+(m-2000)/200*100;
		
		System.out.println("운행거리: "+m+"m");
		System.out.println("요금: "+fare+"원");
		
		
	}
}
