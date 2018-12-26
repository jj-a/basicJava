package oop1119;

public class ForTest3 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest3 ]"+"\n");
		
		
		// 10으로부터 임의의 x값을 n번 뺀 후 값이 음수가 되면 마이너스한 횟수 계산
		System.out.println("[lab1] 마이너스 횟수 계산하기");
		
		int x=1;
		int cnt=0;
		
		for(int i=10;i>-1;) {
			i-=x;
			cnt++;
		}
		
		System.out.println("x="+x);
		System.out.println("10에서 마이너스한 횟수 : "+cnt+"회");
		
		
		
		//  달팽이 낮=3cm up,  밤=2.5cm down, 13cm 나무꼭대기에 올라가는데 걸리는 날짜 
		System.out.println("\n\n[lab2] 달팽이가 나무꼭대기까지 올라가는데 걸리는 날짜");
		
		int day;
		double up=3, down=2.5;
		double top=13;
		double count=0;
		
		for(int i=1;true;i++){
			count+=up;
			if(count>=top){
				day=i; 
				break;
			}
			count-=down;
		}
		
		System.out.println("나무 길이="+top+"(cm)");
		System.out.println("소요날짜 : "+day+"일");
		
		
		
		// 1-2+3-4+5 ... 100 = +홀수-짝수 계산식 값 구하기
		System.out.println("\n\n[lab3] '+홀수-짝수' 계산식 값 구하기");
		
		int sum=0;
		for(int i=1;i<=100;i++) {		// 홀/짝으로 나눔
			if(i%2==0) sum-=i;	
			else sum+=i;
		}
		
		System.out.println("1-2+3-4+5 ... 100 = "+sum);	// 전체값 s일때, (s/2)*-1
		
		
		
		// (1/2)-(2/3)+(3/4)-(4/5)+(5/6)...(99/100) 계산식 값 구하기
		System.out.println("\n\n[lab4] 분수 +/- 반복 계산식 값 구하기");

		boolean plus=true;		// switch
		double result=0;
		
		for(int i=1;i<100;i++) {		// switch방식 이용
			double j=i+1;
			if(plus==true) result+=(i/j);
			else result-=(i/j);
			plus=!plus;
		}
		
		System.out.println("(1/2)-(2/3)+(3/4)-(4/5)+(5/6)...(99/100) = "+result);
		
		
		
		// 두 수 사이의 합 구하기
		System.out.println("\n\n[lab5] 두 수 사이의 합");
		
		int a=5, b=3;
		sum=0;
		
		if(a<b) {
			for(int i=a;i<=b;i++) sum+=i;
		}
		else {
			for(int i=a;i>=b;i--) sum+=i;
		}
		
		System.out.println(a+"~"+b+"의 합 = "+sum);
		
		
		
	}
}
