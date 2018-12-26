package oop1127;

public class ThisTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ThisTest2 ]"+"\n");
		
		Score1 p1=new Score1("철수",70,80,70);
		p1.display();
		

	}
}

class Score1{
	
	// variable (field)
	private String name;
	private int kor, eng, mat, avg;
	
	
	// constructor
	
	public Score1(String name, int kor, int eng, int mat) {
		this();		// 자기자신 호출 시 반드시 first line에서 호출
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = (kor+eng+mat)/3;
	}

	public Score1(String name) {
		this.name = name;
	}
	
	public Score1(){
		;
	}
	
	// method
	
	public void display() {
		System.out.println(this.name+" "+this.kor+" "+this.eng+" "+this.mat+" "+this.avg);
	}
	
	
}