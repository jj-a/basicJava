package oop1119;

public class ForTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ForTest2 ]"+"\n");
		
		//짝수의 합 구하기
		System.out.println("[짝수의 합 구하기]");

		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println("1~10 짝수의 합 = "+sum);

		
		//홀수의 합 구하기
		System.out.println("\n\n[홀수의 합 구하기]");

		sum=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) sum+=i;
		}
		System.out.println("1~100 홀수의 합 = "+sum);
		
		
		// 4 Factorial 값 구하기
		System.out.println("\n\n[4 Factorial 구하기]");
		
		int n=4;
		int fac=1;
		for(int i=n;i>0;i--) fac*=i;
		System.out.println(n+"!="+fac);
		

		// 1~100 사이에서 짝수의 합, 홀수의 합 각각 구하기
		System.out.println("\n\n[짝수의 합, 홀수의 합-1]");
		
		int sum1=0, sum2=0;
		n=100;
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) sum2+=i;
			else sum1+=i;
		}
		
		System.out.println("계산 대상 = 1~"+n);
		System.out.println("짝수의 합 = "+sum2);
		System.out.println("홀수의 합 = "+sum1);
		

		// 1~100 사이에서 짝수의 합, 홀수의 합 각각 구하기 (Switch방식-true/false)
		System.out.println("\n\n[짝수의 합, 홀수의 합-2]");
		
		boolean flag=false;
		sum1=0;
		sum2=0;
		n=100;
		
		for(int i=1;i<=n;i++) {
			if(flag) sum2+=i;
			else sum1+=i;
			flag=!flag;
		}
		
		System.out.println("계산 대상 = 1~"+n);
		System.out.println("짝수의 합 = "+sum2);
		System.out.println("홀수의 합 = "+sum1);
		

	}

}
