package oop1126;

public class ConstructorTest1 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ConstructorTest1 ]"+"\n");
		
		Score2 p1=new Score2("철수",60,50,80);
		
		Score2 p2=new Score2();
		p2.setName("영희");
		p2.setKor(90);
		p2.setEng(80);
		p2.setMat(85);
		p2.setAvr();
		
		Score2 p3=new Score2("옥자");
		p3.setKor(50);
		p3.setEng(85);
		p3.setMat(90);
		p3.setAvr();

		Score2 p4=new Score2();
		p4.init("진수" ,65,95,40);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		
		System.out.println();
		
		// Integer 클래스
		Integer n=new Integer(5);		// Object형
		System.out.println(n.toString());
		
		int n2=5;	// 기본 int형
		System.out.println(n2);
		
		Integer n3=new Integer("7");
		System.out.println(n3.intValue());
		
		// String 클래스
		String str=new String("hello");
		String str2="Photon";
		System.out.println(str.toString());
		System.out.println(str2.toString());
		
		char c[]= {'h','e','l','l','o'};
		String str3=new String(c);
		System.out.println(str3.toString());
		
		// StringBuffer 클래스
		StringBuffer buffer=new StringBuffer("APPLE");
		String str4=new String(buffer);
		System.out.println(str4);
		System.out.println(buffer.toString());
		
		System.out.println();
		
		String name=new String("MARY");
		String s=new String("MARY");
		
		// 주소값 비교 (==)
		System.out.print("Object1==Object2  => ");
		if(name==s) System.out.println("Equal");
		else System.out.println("Difference");
		
		// 실제값 비교 (.equals())
		System.out.print("Object1.equals(Object2)  => ");
		if(name.equals(s)) System.out.println("Equal");
		else System.out.println("Difference");
		
		
		/*  Hash Code 해시코드  */
		
		String str5=name;
		System.out.println("\n[ String.hashCode() ]");
		System.out.println(name.hashCode());
		System.out.println(str5.hashCode());
		System.out.println(s.hashCode());
		// ↑동일한 hashcode값 나옴
		
		// hashCode() : 객체를 구별하기 위한 고유의 정수(integer) 값
		// 다른 값을 가지면 다른 객체, 동일한 값을 가지면 같은 객체로 판별. 참조주소가 같으면 hashcode가 같음
		// 단, String형의 hashCode()는 Overriding되어 객체의 저장된 문자열(ascii code의 조합으로 계산) 기반으로 hashcode가 생성됨
		// 수식:  s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		
		System.out.println("\n[ System.identityHashCode(String s) ]");
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(s));
		// ↑다른 hashcode값 나옴
		
		// String형에서 주소값 기반으로 hashcode 얻는 방법
		// System.identityHashCode(Object x) 메소드 사용
		

	}
}


class Score2{
	
	// parameter
	
	private String name;
	private int kor, eng, mat, avr;
	
	
	// constructor
	
	Score2(String name, int kor, int eng, int mat){		// 초기값 o
		setName(name);
		setKor(kor);
		setEng(eng);
		setMat(mat);
		setAvr(kor,eng,mat);
	}
	
	Score2(String name){
		setName(name);
	}
	
	Score2() {		// 초기값 x
		;
	}
	
	
	// method
	
	public void display() {
		System.out.println("["+name+"] "+kor+" / "+eng+" / "+mat+" / "+avr);
	}
	
	public void init(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.mat = mat;
		this.avr=(kor+eng+mat)/3;
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
		this.avr=(kor+eng+mat)/3;		// 메소드 parameter (전달값)   // 우선순위: 전달값 > 내부변수
	}
	public void setAvr() {
		this.avr=(kor+eng+mat)/3;		// class 내부 parameter (ex: this.kor)
	}
	
}