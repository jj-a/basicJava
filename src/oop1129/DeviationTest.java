package oop1129;
// ** 편차 **
// 5개의 데이터에 대한 평균을 구한 후 각 데이터에서 평균값을 뺀 편차를 구하여 출력
public class DeviationTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - DeviationTest ]"+"\n");
		
		int su[]= {3,6,4,5,8};
		
		Deviation dev=new Deviation(su);
		dev.Display();
		
	}
}

class Deviation {
	private int data[];
	private double dev[];
	private double avr;
	
	public Deviation(int arr[]) {
		this.data=arr;
		dev=new double[data.length];
	}
	
	public Deviation() {
		;
	}
	
	private void CalDeviation() {		// 편차 계산
		Average();
		for(int i=0;i<data.length;i++) dev[i]=data[i]-avr;
	}
	
	private void Average() {		// 평균값 저장
		double avr=0;
		for(int i=0;i<data.length;i++) avr+=data[i];
		avr/=data.length;
		this.avr=avr;
	}
	
	public void Display() {		// 출력
		CalDeviation();
		System.out.println("평균: "+avr+"\n");
		System.out.println("데이터     편차");
		for(int i=0;i<data.length;i++) {
			System.out.println("    "+data[i]+"      "+dev[i]);
		}
	}
	
}