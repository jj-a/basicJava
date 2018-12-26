package oop1129;

public class OverrideTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - OverrideTest ]"+"\n");
		
		Seoul seoul=new Seoul();
		System.out.println(seoul.name);
		seoul.display();
		
		System.out.println();
		
		Jeju jeju=new Jeju();
		System.out.println(jeju.name);
		jeju.display();

		System.out.println();
		
		Busan busan=new Busan();
		System.out.println(busan.toString());
		
		System.out.println();
		
		Suwon suwon=new Suwon();
		System.out.println(suwon);
		
		Incheon incheon=new Incheon();
		System.out.println(incheon.toString());
	
		
	}
}


class Korea {
	String name="한국";
	void display() {
		System.out.print("Korea"+" ");
	}
}

class Seoul extends Korea {
	String name="서울";
	
	@Override		// annotation
	void display() {
		super.display();
		System.out.println("Seoul");
	}
}

class Suwon extends Object{
	private String id="webmaster";
	private String password="1234";
	
	@Override
	public String toString() {
		return "Suwon [id="+this.id+",password="+this.password+"]";
	}
}

class Incheon extends Korea {
	private String name="솔데스크";
	private String addr="종로구 관철동";
	
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", addr=" + addr + "]";
	}
}


class Busan extends Korea {
	@Override
	public String toString() {
		return "Busan";
	}
}

class Jeju extends Korea {
	@Override
	void display() {
		super.display();
		System.out.println("Jeju");
	}
}

