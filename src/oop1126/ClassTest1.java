package oop1126;
/*
 *  Class - Access Modifier (접근 제어) :
 *  private / package(default) / protected / public
 */
public class ClassTest1 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ClassTest1 ]"+"\n");
		
		Score s1=new Score("철수",90,80,70);
		Score s2=new Score("영희",75,50,85);
		
		System.out.println("[이름] 국 / 영 / 수 / 평균"+"\n"+"--------------------------");
		
		System.out.print("["+s1.getName()+"] ");
		System.out.println(s1.getKor()+" / "+s1.getEng()+" / "+s1.getMat()+" / "+s1.getAvr());		// = Score.display()

		s2.display();
		
		 s2=null;		// 메모리 할당 초기화
		//s2.display();		// NullPointerException
		 
		Score s3=new Score();
		s3.setName("옥자");
		s3.setKor(60);
		s3.setEng(90);
		s3.setMat(45);
		s3.calc();
		s3.display();
		
		
	}
}

class Score{
	
	private String name;
	private int kor, eng, mat;
	private int avr;
	
	// constructor 생성자 & 초기화
	Score(String name, int kor, int eng, int mat){
		setName(name);
		setKor(kor);
		setEng(eng);
		setMat(mat);
		setAvr(kor,eng,mat);
	}
	
	Score(){		// 초기값이 없을 경우 처리
		
	}
	
	void calc() {		// package (default)
		avr=(kor+eng+mat)/3;
	}
	
	public void display() {
		System.out.println("["+name+"] "+kor+" / "+eng+" / "+mat+" / "+avr);
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
	public int getAvr() {
		return avr;
	}
	private void setAvr(int kor, int eng, int mat) {
		this.avr=(kor+eng+mat)/3;
	}
	
	
	
}