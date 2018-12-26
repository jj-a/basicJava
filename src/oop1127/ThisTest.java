package oop1127;

public class ThisTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ThisTest ]"+"\n");

		Score p1=new Score();
		Score p2=new Score("영희",80,70,60);
		
		p1.setName("철수");
		p1.setKor(55);
		p1.setEng(60);
		p1.setMat(70);
		p1.setAvg();
		
		p1.display();
		System.out.println(p2.getName()+" "+p2.getKor()+" "+p2.getEng()+" "+p2.getMat()+" "+p2.getAvg());
		
		
	}
}

class Score{
	
	// variable
	private String name;
	private int kor, eng, mat, avg;
	
	// constructor
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = (kor+eng+mat)/3;
	}

	public Score(String name) {
		this.name = name;
	}
	
	public Score(){
		;
	}

	// method
	public void display() {
		System.out.println(this.name+" "+this.kor+" "+this.eng+" "+this.mat+" "+this.avg);
	}
	
	// getter&setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (kor+eng+mat)/3;	// 멤버변수
	}
	
	
}