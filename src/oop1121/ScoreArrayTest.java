package oop1121;

public class ScoreArrayTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - ScoreTest ]"+"\n");
		
		String name[]= {"묵","택","기","락","연"};
		int kor[]= {95,95,70,75,80};
		int eng[]= {90,100,30,39,60};
		int mat[]= {90,95,40,98,70};
		int size=name.length;
		int avr[]= new int[size];		
		int rank[]=new int[size];
		
		for(int i=0;i<size;i++) rank[i]=i+1;
		
		// 평균
		for(int i=0;i<size;i++)
			avr[i]=(kor[i]+eng[i]+mat[i])/3;
			
		// 석차
		int swap;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((avr[i]<avr[j]&&rank[i]<rank[j])||(avr[i]>avr[j]&&rank[i]>rank[j])) {		// swap
					swap=rank[i];
					rank[i]=rank[j];
					rank[j]=swap;
				}
				/*
				if(avr[i]<avr[j]) rank[i]++;		// 증감
				 */
			}
		}
		
		
		// 과락 체크
		String result[]= new String[size];
		for(int i=0;i<size;i++) result[i]="";
		
		for(int i=0;i<size;i++) {
			if(avr[i]>=70) {
				/*
				if(kor<40||eng<40||mat<40) result="재시험";
				else result="합격";
				*/
				if(kor[i]>=40&&eng[i]>=40&&mat[i]>=40) result[i]="합격";
				else result[i]="재시험";
			}
			else result[i]="불합격";
		}

		
		// 평균 95이상이면 장학생
		boolean great[]=new boolean[size];
		
		for(int i=0;i<size;i++) {
			if(avr[i]>=95) great[i]=true;
			else great[i]=false;
		}

		
		// 출력
		System.out.println("이름 / 국어 / 영어 / 수학 / 평균 / 석차 / 결과");
		
		for(int i=0;i<size;i++) {
			System.out.print(" "+name[i]);
			System.out.print("  /  "+kor[i]+"  /  "+eng[i]+"  /  "+mat[i]+"  /  "+avr[i]+"  /  "+rank[i]+"등  /  "+result[i]+"  /  ");
			for(int j=1;j<=avr[i]/10;j++) System.out.print("*");	// 평균 10점당 별(*) 1개
			if(great[i]==true) System.out.print("  [장학생]");
			System.out.println();
		}
		
		
	}
}
