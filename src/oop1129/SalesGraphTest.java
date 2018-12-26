package oop1129;
// ** 판매실적 그래프 ** 
// 어느 회사의 판매 실적에 대한 그래프를 그리는 프로그램
public class SalesGraphTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - SalesGraphTest ]"+"\n");
		
		int sales[]= {18,17,13,12,14,17,14,16,18,19,11,9};
		
		Graph g=new Graph(sales);
		g.printGraph();

	}

}

class Graph {
	private int sales[];
	private int max;

	public Graph(int arr[]){
		this.sales=arr;
		this.max=max();
	}
	
	public Graph(){
		;
	}
	
	public void printGraph() {		// 그래프 출력
		
		for(int i=max;i>0;i--) {
			System.out.print("  ");
			for(int j=0;j<sales.length;j++) {
				if(sales[j]>=i) System.out.print("＊");
				else System.out.print("　");
			}
			System.out.println();
		}
		
		for(int i=0;i<sales.length;i++) {
			System.out.print((i+1)+" ");
		}
		
	}
	
	public int max() {		// 최대값 찾기 (최초 max 호출 시)
		return Math.max(sales[sales.length-1],max(sales.length-2));
	}
	
	public int max(int n) {		// 재귀호출
		if(n==0) return sales[0];
		return Math.max(sales[n],max(n-1));
	}
	
	
}