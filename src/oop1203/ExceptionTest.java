package oop1203;

/* 
 *  Exception
 *  
 *  1) try-catch		- 예외 처리
 *  2) throw	- 예외 선언
 *  3) finally	- 예외 처리 후
 *  
 */

public class ExceptionTest {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ExceptionTest ]"+"\n");
		
		
		System.out.println("1)");
		try {
		System.out.println(2/0);
		}
		catch(ArithmeticException e){
			System.out.println("예외 발생 : "+e);
		}
		System.out.println("Program end");
		
		
		System.out.println("\n2)");
		try {
		int arr[]=new int[3];
		arr[3]=5;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : "+e);
		}
		System.out.println("Program end");
		
		
		System.out.println("\n3)");
		try {
			Exception ex=new Exception("throw Exception");
			throw ex;
		}catch(Exception ex) {
			System.out.println("예외 발생: "+ex.getMessage());
		}
		System.out.println("Program end");
		
		
		System.out.println("\n4)");
		try {
			int a[]=null;
			a[0]=10;
		}catch(Exception e) {
			System.out.println("예외 발생: "+e);
		}finally {
			System.out.println("예외 처리 후");
		}
		System.out.println("Program end");
		

		System.out.println("\n5)");
		try {
			System.out.println(1);
			System.out.println(2/0);
			int arr2[]=new int[3];
			arr2[3]=5;
			
			System.out.println(Integer.parseInt("SKY"));
			Integer inte=null;
			System.out.println(7/inte);
			System.out.println(9);
		}catch(Exception e) {
			System.out.println("예외 발생: "+e);
		}
		System.out.println("Program end");
		
		
	}
}
