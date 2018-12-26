package oop1130;

public class InterfaceTest2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - InterfaceTest2 ]"+"\n");
		
		int a=20, b=10;
		Calc cal=new Calc();
		System.out.println(a+"+"+b+" = "+cal.add(a, b));
		System.out.println(a+"-"+b+" = "+cal.sub(a, b));
		System.out.println(a+"*"+b+" = "+cal.mul(a, b));
		System.out.println(a+"/"+b+" = "+cal.div(a, b));
		System.out.println(a+"%"+b+" = "+cal.mod(a, b));

	}
}

interface ICalc {		// 산술 연산
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
	public int mod(int a, int b);
}

class Calc implements ICalc {

	@Override
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}
	@Override
	public int sub(int a, int b) {
		int sum=a-b;
		return sum;
	}

	@Override
	public int mul(int a, int b) {
		int sum=a*b;
		return sum;
	}

	@Override
	public int div(int a, int b) {
		int sum=a/b;
		return sum;
	}

	@Override
	public int mod(int a, int b) {
		int sum=a%b;
		return sum;
	}
	
}