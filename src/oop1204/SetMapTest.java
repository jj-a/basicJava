package oop1204;

import java.util.*;

public class SetMapTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - SetMapTest ]"+"\n");
		
		
		// HashSet
		
		Set<Object> set=new HashSet<>();
		set.add(3);
		set.add(4.5);
		set.add("Happy");
		set.add(new Integer(7));
		
		Object setarr[]=set.toArray();		// toArray() 배열에 저장
		System.out.println("HashSet: ");
		for(int i=0;i<setarr.length;i++) System.out.println(setarr[i]);
		
		//set.removeAll(set);
		
		
		// HashMap
		
		HashMap<Integer,Object> map=new HashMap<>();
		// HashMap<K,V> = key type/value type
		// HashMap.put(key,value) = key, value 자료형은 위에서 선언한대로
		map.put(0,1);
		map.put(1,2);
		map.put(2,3);

		System.out.println("\nHashMap: ");
		for(int i=0;i<map.size();i++) System.out.println(map.get(i));
		
		
		// Iterator
		// 저장된 요소를 읽어오는 interface
		
		System.out.println("\nIterator test: ");
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println(key);
		}
		
		
		// lab1. "="를 기준으로 문자열 분리해서 map 저장
		// key = value -> 각각 분리
		System.out.println("\n[lab1] 문자열 분리하여 map에 저장하기");
		
		set=new HashSet<>();
		set.add("list.do=net.bbs.List");
		set.add("read.do=net.bbs.Read");
		set.add("write.do=net.bbs.Write");
		
		HashMap<String,String> hash=new HashMap<>();
		it=set.iterator();
		
		for(int i=0;i<set.size();i++) {
			while(it.hasNext()) {
				String str[]=((String) it.next()).split("=");
				hash.put(str[0],str[1]);
			}
		}
		
		System.out.println(hash.get("list.do"));
		System.out.println(hash.get("read.do"));
		System.out.println(hash.get("write.do"));
		
		
	}
}
