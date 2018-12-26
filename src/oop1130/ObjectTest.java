package oop1130;

public class ObjectTest {
	public static void main(String[] args) {

		System.out.println("[ JJA - ObjectTest ]"+"\n");
		
		Integer inte=new Integer(3);
		System.out.println(inte);
		System.out.println(inte.toString());
		
		String str=new String("Happy");
		System.out.println(str);
		System.out.println(str.toString());
		
		Object obj=new Integer(5);
		System.out.println(obj);
		System.out.println(obj.toString());
		
		obj=new String("Apple");
		
		String name=(String)obj;
		System.out.println(name);
		System.out.println(name.toString());
		
		System.out.println("----------");
		
		Print.view(3);
		Print.view(4.5);
		Print.view("Happy");
		Print.view(new Integer(6));
		Print.view(new Double(7.8));
		Print.view(new String("Apple"));
		
		System.out.println("----------");
		
		obj=Print.display(10);
		System.out.println(obj);
		
		inte=Print.display(20);
		System.out.println(inte);
		
		Double db=Print.display(5.5);
		System.out.println(db);
		
		
	}
}


class Print {
	
	public Print() {
		;
	}
	/*
	public static void view(Integer a) {
		System.out.println(a.toString());
	}
	
	public static void view(Double a) {
		System.out.println(a.toString());
	}
	
	public static void view(String a) {
		System.out.println(a.toString());
	}
	*/
	public static void  view(Object o) {		// 어떠한 객체형태의 매개변수도 허용
		System.out.println(o.toString());
	}
	
	public static Object display(long n) {
		return new Integer((int)n);
	}
	
	public static Integer display(int n) {
		return new Integer(n);
	}
	
	public static Double display(double n) {
		return new Double(n);
	}
	
	
}

