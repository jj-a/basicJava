package oop1119;

public class BreakTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - BreakTest ]"+"\n");
		
		
		for(int i=1;i<10;i++) {
			if(i==5) break;
			System.out.print(i+" ");
		}
		System.out.println();

		for(int i=1;i<10;i++) {
			if(i==5) continue;
			System.out.print(i+" ");
		}
		
	}
}
