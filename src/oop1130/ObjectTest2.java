package oop1130;

public class ObjectTest2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - ObjectTest2 ]"+"\n");
		
		
		Screen screen=new TypeA();
		System.out.println(screen.getData());
		screen=new TypeB();
		System.out.println(screen.getData());
		
		System.out.println("----------");
		
		TypeA a=new TypeA();
		TypeB b=new TypeB();

		Picture.dispStar(a);
		Picture.dispStar(b);
		

	}
}

class Screen{

	public String getData() {
		return null;
	}
	
}

class TypeA extends Screen {
	
	@Override
	public String getData() {
		return "Bohemian Rapsody";
	}
	
}

class TypeB extends Screen {

	@Override
	public String getData() {
		return "Fantastic Beasts";
	}
	
}

class Picture {
	/*
	public static void dispStar(TypeA a) {
		System.out.println(a.getData());
	}
	public static void dispStar(TypeB b) {
		System.out.println(b.getData());
	}
	*/
	public static void dispStar(Screen s) {
		System.out.println(s.getData());
	}
	public static void dispStar(Object o) {
		System.out.println((Screen)o);
	}
}
