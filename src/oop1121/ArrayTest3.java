package oop1121;

public class ArrayTest3 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayTest3 ]"+"\n");

		
		System.out.println("*정수형 배열");
		int arr[]= {-5,6,0,9,3};
		int size=arr.length;

		System.out.println("배열 길이 "+size);
		for(int i=0;i<size;i++) System.out.print(arr[i]+" ");

		
		System.out.println("\n\n");
		System.out.print("▼정수형 배열에 관한 문제▼");
		
		
		// lab1. 배열 요소의 전체의 합 구하기
		System.out.println("\n\n[lab1] 배열 전체의 합");
		
		int sum=0;
		for(int i=0;i<size;i++) sum+=arr[i];
		
		System.out.println("sum = "+sum);
		
		
		// lab2. 양수 중 짝수의 합 구하기
		System.out.println("\n\n[lab2] 양수 중 짝수의 합");
		
		sum=0;
		for(int i=0;i<size;i++) {
			if(arr[i]>=0&&arr[i]%2==0) sum+=arr[i];
		}
		
		System.out.println("sum = "+sum);
		
		
		// lab3. 음수의 개수 구하기
		System.out.println("\n\n[lab3] 음수의 개수");
		
		int cnt=0;
		for(int i=0;i<size;i++) {
			if(arr[i]<0) cnt++;
		}
		
		System.out.println("음수 : "+cnt+"개");
		
		
		// lab4. arr[2]의 등수 구하기
		System.out.println("\n\n[lab4] arr[2]의 등수");
		
		int rank[]=new int[size];
		int target=2;
		int swap;
		
		for(int i=0;i<size;i++) rank[i]=i+1;	// rank 초기화  (ex) {1,2,3,4,5}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((arr[i]<arr[j]&&rank[i]<rank[j])||(arr[i]>arr[j]&&rank[i]>rank[j])) {		// swap
					swap=rank[i];
					rank[i]=rank[j];
					rank[j]=swap;
				}
				/*
				if(arr[i]<arr[j]) rank[i]++;		// 증감
				 */
			}
		}
		
		System.out.println("arr["+target+"] : "+rank[target]+"등");

		
		// lab5. 최대값, 최소값 구하기
		System.out.println("\n\n[lab5] 최대값, 최소값");
		
		int min=arr[0], max=arr[0];
		
		for(int i=0;i<size;i++) {
			if(arr[i]<min) min=arr[i];
			else if(arr[i]>max) max=arr[i];
		}
		
		System.out.println("최대값 = "+max+"\n최소값 = "+min);
		
		
		// lab6. 배열 요소 각각의 등수 구하기
		System.out.println("\n\n[lab6] 등수 정보");

		// 변수 선언 lab4에서 다 함 (rank[size],swap)  알고리즘 동일
		
		for(int i=0;i<size;i++) rank[i]=i+1;	// rank 초기화  (ex) {1,2,3,4,5}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((arr[i]<arr[j]&&rank[i]<rank[j])||(arr[i]>arr[j]&&rank[i]>rank[j])) {		// swap
					swap=rank[i];
					rank[i]=rank[j];
					rank[j]=swap;
				}
				/*
				if(arr[i]<arr[j]) rank[i]++;		// 증감
				 */
			}
		}
		
		for(int i=0;i<size;i++) 		// 랭킹 정보 출력
			System.out.println("["+i+"] "+arr[i]+"  RANK:"+rank[i]+"등 ");

		
	}
}
