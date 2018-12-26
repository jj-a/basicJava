package oop1130;

public class AbstractTest2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - AbstractTest2 ]"+"\n");
		
		Travel t=new CourseA();
		System.out.println(t.travelWhere());
		
		t=new CourseB();
		System.out.println(t.travelWhere());

		t=new CourseC();
		System.out.println(t.travelWhere());
		
		
	}
}

abstract class Travel {
	
	public void line() {
		;
	}
	
	abstract public String travelWhere();
	
}


class CourseA extends Travel {
	@Override
	public String travelWhere() {
		return "제주도 올레길";
	}
}

class CourseB extends Travel {
	@Override
	public String travelWhere() {
		return "일본 홋카이도";
	}
}

class CourseC extends Travel {
	@Override
	public String travelWhere() {
		return "베트남 호치민";
	}
}

