package oop1203;

import oop1203.WebProgram.Language;

public class InnerTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - InnerTest ]"+"\n");
		
		WebProgram web=new WebProgram();
		web.print();
		
		Language lang=new WebProgram().new Language();
		
		lang.display();
		
		System.out.println(R.id.btn);
		
	}
}

class WebProgram {
	String title="Java Programming";
	
	void print() {
		Language lang=new Language();
		lang.display();
		SmartPhone smart=new SmartPhone();
		smart.display();
	}
	
	class Language {
		String basic="JAVA, HTML, CSS, JavaScript";
		void display() {
			System.out.println("기초수업: "+basic);
		}
	}
	
	class SmartPhone {
		String basic="Object-C, JavaOOP, C#";
		void display() {
			System.out.println("기초수업: "+basic);
		}
	}
		
}


class R {
	static class id {
		 static String btn="Button";
	}
}
