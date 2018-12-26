package oop1203;

public class GetSetTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - GetSetTest ]"+"\n");
		
		Score p=new Score("달콤커피",50,60,70);
		
		System.out.println("이름: "+p.getName());
		System.out.println("국어: "+p.getKor());
		System.out.println("영어: "+p.getEng());
		System.out.println("수학: "+p.getMat());
		System.out.println("평균: "+p.getAvr());
		
		
		System.out.println(p.toString());
		
	}
}

class Score {


	private String name;
	private int kor,eng,mat,avr;
	
	
	// constructor
	
	public Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avr = (kor+eng+mat)/3;
	}

	public Score() {
		;
	}
	
	// method
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avr=" + avr + "]";
	}
	
	
	// getter & setter
	
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

	public int getAvr() {
		return avr;
	}

	public void setAvr(int kor, int eng, int mat) {
		this.avr=(kor+eng+mat)/3;
	}

	public void setAvr() {
		avr=(kor+eng+mat)/3;
	}
	
	
	
}