package oop1122;
import java.util.Arrays;

public class LottoTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - LottoTest ]"+"\n");
		
		// 제곱 (a^b)
		System.out.println(Math.pow(2, 3));
		

		// 난수 (Math.random)
		System.out.println("난수 생성(random)▼");
		for(int i=0;i<50;i++) {
			System.out.print((int)(Math.random()*10)+1+" ");
		}
		
		//  **참고**  Java 난수 생성 방식  (ex. 1~10의 난수 발생)
		//  1)  Math.random 메소드(실수 double형) 이용 - Math.random()*10+1
		//  2)  Random 클래스 (정수 long형) 이용 -  Random 객체 생성 후 (ex. random) random.nextInt(10)+1
		
		// Math.random() 난수 발생 범위: 기본값 double형(8bit) 0.0 ~ 1.0
		// Random.nextInt() 난수 발생 범위: Int형(4bit) 0 ~ 입력값a-1 사이
		
		System.out.println();
		
		
		// lab1. 주사위 범위 (1~6) 난수 생성
		System.out.println("\n\n[lab1] 주사위 범위 (1~6)");
		for(int i=0;i<30;i++) {
			System.out.print((int)(Math.random()*6)+1+" ");
		}
		
		
		// lab2. 로또 범위 (1~45) 난수 생성 (*중복 제외)
		System.out.println("\n\n[lab2] 로또 추첨 (1~45중 랜덤 숫자 6개) (중복 제외)");
		
		int n=6;
		int lottonum[]= new int[n];
		for(int i=0;i<n;i++) lottonum[i]=0;		// 배열 초기화
		
		int i=0;
		do {
			lottonum[i]=(int)(Math.random()*45)+1;
			boolean next=true;
			for(int j=0;j<i;j++) {		// 중복검사
				if(lottonum[i]==lottonum[j]) {
					next=false; break;
				}
			}
			if(next==true) i++;
		}while(i<n);

		Arrays.sort(lottonum);		// 오름차순 정렬
		
		System.out.print("로또 번호 생성> ");
		for(i=0;i<n;i++) System.out.print("["+lottonum[i]+"] ");
		
		
	}
}
