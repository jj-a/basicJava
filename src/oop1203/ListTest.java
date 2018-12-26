package oop1203;

import java.util.*;

/*
 * List계열(순서O): List / Vector / ArrayList / Collections
 * Set계열(순서X): Set / HashSet / TreeSet / Iterator
 * Map계열(순서X): Map / HashMap / TreeMap / HashTable
 */

public class ListTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - ListTest ]"+"\n");
		
		// Vector
		
		List<Object> list =new Vector<Object>();
		Vector<Object> vec=new Vector<Object>();
		
		vec.add(3);
		vec.add(5.6);
		vec.add("HAPPY");
		vec.add(new Integer(7));
		vec.add(new Character('R'));
		vec.add(new String("APPLE"));
		
		System.out.println("데이터 개수: "+vec.size());
		
		for(int i=0;i<vec.size();i++) {
			System.out.println(i+"] "+vec.get(i));
		}
		
		Object obj=vec.get(5);
		System.out.println(obj.toString());
		
		String str=(String)obj;
		System.out.println(str);
		
		
		vec.remove(3);
		for(int i=0;i<vec.size();i++) {
			System.out.println(i+"] "+vec.get(i));
		}
		vec.removeAllElements();
		System.out.println();
		if(vec.isEmpty()) System.out.println("비어있음");
		else System.out.println("남아있음");
		
		
		// lab1. remove()를 이용하여 모든 요소 삭제
		System.out.println("\n[lab1] List(Vector)의 요소 삭제하기 (removeAllElements()이용X)");
		
		System.out.print("삭제 전: ");
		for(int i=0;i<10;i++) {
			vec.add(i);
			System.out.print(vec.get(i)+" ");
		}
		
		for(int i=vec.size()-1;i>=0;i--) vec.remove(i);		// 뒤에서부터 삭제. remove시 뒤 index의 요소들이 앞으로 옴
		
		System.out.print("\n삭제 후: ");
		for(int i=vec.size()-1;i>=0;i--) System.out.print(vec.get(i)+" ");
		

		if(vec.isEmpty()) System.out.println("[비어있음]");
		else System.out.println("[남아있음]");
		
		System.out.println();
		
		
		// ArrayList
		
		list=new ArrayList<Object>();
		list.add(5);
		list.add(3.4);
		list.add('R');
		list.add("SOLDESK");
		list.add(new Integer(7));
		list.add(new Double(8.9));
		list.add(new String("JAVA"));

		for(int i=list.size()-1;i>=0;i--) System.out.print(list.get(i)+" ");
		
		if(list.isEmpty()) System.out.println("[비어있음]");
		else System.out.println("[남아있음]");

	}

}
