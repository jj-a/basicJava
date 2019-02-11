package oop0211;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		
		try {
			String filename="D:\\java_1113\\workspace\\basicJava\\src\\oop0211\\command.properties";
			FileInputStream fis=new FileInputStream(filename);
			
			Properties pr=new Properties();		// '='을 기준으로 key,value 구분하여 저장하는 클래스
			pr.load(fis);
			
			Iterator<Object> iter=pr.keySet().iterator();	// Pointer 비슷한 객체
			
			while(iter.hasNext()) {
				String key=(String)iter.next();
				String value=pr.getProperty(key);
				System.out.println("Key: "+key);
				System.out.println("Value: "+value);
			}
			
			
		}catch(Exception e) {
			System.out.println("Failed! "+e);
			
		}
		
	}
}
