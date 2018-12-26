package oop1129;
// ** 히스토그램 **
// 어느 학급의 신장에 대한 데이터가 준비되어 있을 때, 이 데이터에 대한 히스토그램을 작성하는 프로그램
public class HistogramTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - HistogramTest ]"+"\n");;
		
		int data[]= {3,2,12,15,17,18,7};
		
		Histogram h=new Histogram(data);
		h.printHistogram();

	}

}

class Histogram {

	private int data[];		// length=7
	private final int HEIGHT[]= {134,140,145,150,155,160,165,170};

	public Histogram(int arr[]){
		this.data=arr;
	}
	
	public Histogram(){
		;
	}
	
	public void printHistogram() {		// 그래프 출력
		
		System.out.println("          H/I/S/T/O/G/R/A/M          \n");
		
		for(int i=0;i<data.length;i++) {
			System.out.print(HEIGHT[i]+"-"+(HEIGHT[i+1]-1)+"     ");
			for(int j=1;j<=data[i];j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
		
	}
	
	
}