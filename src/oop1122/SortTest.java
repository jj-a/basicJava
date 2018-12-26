package oop1122;

public class SortTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - SortTest ]"+"\n");
		
		// ASC 오름차순 (ascending sort) / DESC 내림차순 (descending sort)
		// 정렬 유형: Insertion Sort (삽입정렬) / Selection Sort (선택정렬) / Bubble Sort (버블정렬) / Quick Sort (퀵정렬) / Shell Sort (쉘정렬)
		

		int sort[]= {9,7,3,5,1};
		
		// 선택정렬
		System.out.println("[ Selection Sort ]");

		System.out.print("정렬전: ");
		for(int i=0;i<sort.length;i++) System.out.print(sort[i]+" ");
		
		for(int i=0;i<sort.length;i++) {
			for(int j=i+1;j<sort.length;j++) {
				if(sort[i]>sort[j]) {
					int tmp=sort[i];
					sort[i]=sort[j];
					sort[j]=tmp;
				}
			}
		}
		
		System.out.print("\n정렬후: ");
		for(int i=0;i<sort.length;i++) System.out.print(sort[i]+" ");
		
		
		// lab. Bubble Sort 방식으로 내림차순 정렬
		System.out.println("\n\n[ Bubble Sort (DESC) ]");

		System.out.print("정렬전: ");
		for(int i=0;i<sort.length;i++) System.out.print(sort[i]+" ");
		
		for(int i=0;i<sort.length;i++) {
			for(int j=i;j<=i;j++) {
				if(sort[j]<sort[j+1]) {
					int tmp=sort[j];
					sort[j]=sort[j+1];
					sort[j+1]=tmp;
					System.out.println(sort[j]+""+sort[j+1]);
				}
			}
		}
		
		System.out.print("\n정렬후: ");
		for(int i=0;i<sort.length;i++) System.out.print(sort[i]+" ");
		
		
	}
}
