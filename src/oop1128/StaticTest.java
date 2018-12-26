package oop1128;

public class StaticTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - StaticTest ]"+"\n");
		
		// static 정적/클래스 변수,함수 - 직접 접근 가능
		
		Employee kim=new Employee("10001234","경영",2300000);
		Employee lee=new Employee("20004567","행정",1200000);
		
		System.out.println(Employee.COMPANY);
		System.out.println(Employee.TAX);
		
		Employee.Allowance++;
		System.out.println(Employee.Allowance);
		
		
		
		Printf.line();
		Printf.print(lee);
		Printf.line();
		Printf.print(kim);
		Printf.line();
		
	}
	
}

class Employee{
	private String id;          
	private String department;
	private int pay;
	static final String COMPANY="SOLDESK";		// const
	static final double TAX=0.03;		// const
	static int Allowance=10;
	
	
	public Employee(String id, String department, int basicpay) {
		this.id = id;
		this.department = department;
		setPay(basicpay);
	}

	Employee(){
		;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int basicpay) {
		this.pay = (int)((basicpay+Allowance*10000)*(1-TAX));
	}
	
	
}


class Printf{
	static void line() {
		System.out.println("------------------------------");
	}
	static void print(Object obj) {
		System.out.println(obj.toString());
	}
	static void print(Employee e) {
		System.out.println("회사: "+Employee.COMPANY);
		System.out.println("부서: "+e.getDepartment());
		System.out.println("사번: "+e.getId());
		System.out.println("급여: "+e.getPay());
	}
}

