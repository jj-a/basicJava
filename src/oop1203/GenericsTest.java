package oop1203;

import java.util.*;		// java.util.vector, java.util.arraylist, java.util.list, ....

public class GenericsTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - GenericsTest ]"+"\n");
		
		// 리스트 기본형 List<E> listname=new List<E>();
		// <E> = <Elements> = <참조 자료형>  ex. <Integer>
		
		Vector<String> vec=new Vector<>();
		vec.add("A");
		vec.add("B");
		vec.add(new String("C"));
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		
		Mountain m1=new Mountain("관악산",900);
		Mountain m2=new Mountain("치악산",1200);
		Mountain m3=new Mountain("설악산",130);
		
		ArrayList<Mountain> mt=new ArrayList<>();
		
		mt.add(m1);
		mt.add(m2);
		mt.add(m3);
		
		
		for(int i=0;i<mt.size();i++) System.out.println(mt.get(i).name+" "+mt.get(i).height);
		
		
	}
}

class Mountain {
	String name;
	int height;
	
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public Mountain() {
		;
	}
	
	
}
