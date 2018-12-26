package oop1128;

public class ArrayObjectTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ArrayObjectTest ]"+"\n");
		
	    // 객체 배열 Object Array
	    /*
	    int[] a = {2, 4, 6};
	    Integer b1 = new Integer(1);
	    Integer b2 = new Integer(3);
	    Integer b3 = new Integer(5);
	    
	    int[] b    = new int[3];
	    Integer[] inte = new Integer[3]; //객체 배열    
	    inte[0]= new Integer(1);
	    inte[1]= new Integer(3);
	    inte[2]= new Integer(5);
	    System.out.println(inte[0].toString());
	    System.out.println(inte[1].toString());
	    System.out.println(inte[2].toString());
	    System.out.println(inte[0]);
	    System.out.println(inte[1]);
	    System.out.println(inte[2]);
	    */
		
		Integer inte=7;		// autoboxing 기본형이 자동으로 참조형 변환됨
		
		System.out.println(inte);
		
		Integer a[]= {new Integer(1),new Integer(3),new Integer(5)};
		Integer b[]=new Integer[] {1,3,5};
		int size=a.length;
		for(int i=0;i<size;i++) System.out.println(a[i].toString()+" "+b[i]);
		
		
		// lab1. index 0번째와 2번째의 요소값을 서로 교환
		for(int i=0;i<size;i++) System.out.print(a[i].toString()+" ");
		System.out.print(" => ");
		Integer tmp;
		tmp=a[0];
		a[0]=a[2];
		a[2]=tmp;
		for(int i=0;i<size;i++) System.out.print(a[i].toString()+" ");
		
		System.out.println();
		
		Score p[]= {new Score("길동이",80,70,75),new Score("둘리",50,50,50)};	
		for(int i=0;i<2;i++) p[i].display();
		
		Score s1=new Score("철수",70,60,40);
		Score s2=new Score("영희",75,50,80);
		
		System.out.println("Score()의 hashCode: "+s1.hashCode()+" / "+s2.hashCode());
		System.out.println("Score()의 identityHashCode: "+System.identityHashCode(s1)+" / "+System.identityHashCode(s2));
		
		Print prt=new Print();
		
		prt.view1(s1.getKor(),s2.getKor());
		prt.view2(s1,s2);
		
		
		Score temp=s1;
		s1=s2;
		s2=temp;
		
		s1.display();		// s2 값
		s2.display();		// s1 값
		
		
		
	}
}	// ----------------------- main class

class Score{
	
	private String name;
	private int kor, eng, mat, avg;
	
	// constructor
	Score(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = (kor+eng+mat)/3;
	}

	Score(String name) {
		this.name = name;
	}

	Score(){
		;
	}
	
	
	// method
	public void display() {
		System.out.println(name+" "+kor+" "+eng+" "+mat);
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
		this.avg = (kor+eng+mat)/3;
	}
	
}


class Print{
	
	
	// constructor
	Print(){
		
	}
	
	// method
	public void view1(int n1, int n2) {		// Call by Value - int형(Object의 변수) 출력
		
		System.out.println(n1+"+"+n2+"="+(n1+n2));
		
		
	}
	
	public void view2(Score a, Score b) {		// Call by Reference - Object형 출력
		
		System.out.println(a.getKor()+"+"+b.getKor()+"="+(a.getKor()+b.getKor()));
		System.out.println("Print()의 hashCode: "+a.hashCode()+" / "+b.hashCode());
		
		System.out.println("Print()의 identityHashCode: "+System.identityHashCode(a)+" / "+System.identityHashCode(b));

	}
	
}

