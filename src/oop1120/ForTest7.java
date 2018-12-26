package oop1120;

public class ForTest7 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ForTest7 ]"+"\n");

		
		// lab1. 2g,3g,5g 추 각 5개. 
		//세개 추의 조합으로 무게 40~45사이일 때 각 추의 갯수와 무게를 출력하는 프로그램
		System.out.println("\n[lab1] 40~45g에 해당하는 추의 개수,무게 출력");
		
		int g2=5, g3=5, g5=5;
		int gram=0;
		
		for(int i=0;i<=g5;i++) {
			for(int j=0;j<=g3;j++) {
				for(int k=0;k<=g2;k++) {
					gram=i*5+j*3+k*2;
					if(gram>=40&&gram<=45) 
						System.out.println("2g="+k+"개  "+"3g="+j+"개  "+"5g="+i+"개  "+" total="+gram);
				}
			}
		}
		

		// lab2. 누적의 합 구하기 1
		// 1+...+10=55 / 1+...20=210 / 1+...+30  .... 1+...+90 / 1+...+100=5050
		System.out.println("\n\n[lab2] 1~10부터 1~100까지 누적합 구하기(1)]");
		
		int sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i*10;j++) {
				sum+=j;
			}
			System.out.println("1+...+"+i*10+" = "+sum);
			sum=0;
		}
		

		// lab3. 누적의 합 구하기 2
		// 1+...+10=55 / 11+...20=210 / 21+...+30  .... 81+...+90 / 91+...+100=5050
		System.out.println("\n\n[lab3] 1~10부터 1~100까지 누적합 구하기(2)]");

		sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=(i-1)*10+1;j<=i*10;j++) {
				sum+=j;
			}
			System.out.println((i-1)*10+1+"+...+"+i*10+" = "+sum);
			sum=0;
		}
		
		System.out.println();
		
		
	}
}
