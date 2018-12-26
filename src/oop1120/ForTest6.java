package oop1120;

public class ForTest6 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ForTest6 ]"+"\n");
		
		int i=0, j=0;
		
		for(i=1;i<5;i++) {
			for(j=1;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(i=4;i>=1;i--) {
			for(j=1;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		
		System.out.println();
		
		for(char c='A';c<='Z';c++) {
			for (char d='A';d<=c;d++) System.out.print(d);
			System.out.println();
		}
		
	}
}
