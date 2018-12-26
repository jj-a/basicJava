package oop1126;

// import: java package 선언
//import java.util.*;
//import java.io.*;		// input/output
//import java.sql.ResultSet;

public class ConstructorTest2 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - ConstructorTest2 ]"+"\n");
		
		Grade p1=new Grade("철수",60,50,70);
		
		p1.print();
		

	}
}

class Grade{
	
	private String name;
	private int kor, eng, mat;
	private int avr;
	
	
	public Grade(String name, int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		this.avr=(kor+eng+mat)/3;
	}

	public Grade(String name) {
		this.name = name;
	}

	public Grade() {
		;
	}
	
	
	public void print() {
		System.out.println(name+" - 국"+kor+" 영"+eng+" 수"+mat+" 평균"+avr);
	}
	
	
}
