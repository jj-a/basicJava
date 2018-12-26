package oop1122;

public class ArrayTest5 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayTest5 ]"+"\n");

		int arr[][]= {{4,6,8},{1,3,5},{7,2,9}};
		
		int row=arr.length;
		int col=arr[0].length;
		
		// lab1. 행/열 바꿔서 출력하기 (전치행렬)
		// ex. 468/135/729 -> 417/632/859
		System.out.println("\n[lab1] 전치행렬 (행/열 바꿔 출력)");
		
		System.out.println("기존 행렬>");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

		System.out.println("\n전치 행렬>");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}

		
		// lab2. 대각선 합계 (좌측대각선, 우측대각선)
		System.out.println("\n\n[lab2] 배열 대각선 합");

		int rightsum=0, leftsum=0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {		// 중첩for문 안쓰고 단일변수(i)만 써도 상관없음
				if(i==j) rightsum+=arr[i][j];
			}
		}
		System.out.println("우측방향 대각선 합계(↘) : "+rightsum);
		
		for(int i=0;i<row;i++) {
			for(int j=col-1;j>=0;j--) {
				if(i+j==2) leftsum+=arr[i][j];
			}
		}
		System.out.println("좌측방향 대각선 합계(↙) : "+leftsum);
		
		
		// lab3. 행렬 각각의 합/차 구하기
		System.out.println("\n\n[lab3] 행렬 합/차");
		
		int arr1[][]= {{1,2},{3,4}};
		int arr2[][]= {{5,6},{7,7}};
		int arrSum[][]= {{0,0},{0,0}};
		int arrDiff[][]= {{0,0},{0,0}};
		
		row=arr1.length;
		col=arr1[0].length;
		
		System.out.println("\n행렬1 >");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) System.out.print(arr1[i][j]+" ");
			System.out.println();
		}

		System.out.println("\n행렬2 >");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
		
		for(int i=0;i<row;i++) {		// 계산
			for(int j=0;j<col;j++) {
				arrSum[i][j]=arr1[i][j]+arr2[i][j];
				arrDiff[i][j]=Math.abs(arr1[i][j]-arr2[i][j]);
			}
		}
		
		System.out.println("\n합 >");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) System.out.print(arrSum[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("\n차 >");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) System.out.print(arrDiff[i][j]+" ");
			System.out.println();
		}
		
		
		
	}
}
