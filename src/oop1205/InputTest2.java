package oop1205;

import java.io.*;

public class InputTest2 {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - InputTest2 ]"+"\n");

		String path="./src\\oop1205\\data.txt";
		
		try {
			
			// 1) Byte 기반 Stream (2byte 문자 깨짐)
			System.out.println("Byte기반 : ");
			FileInputStream fis=new FileInputStream(path);
			
			int data=0;
			while(true) {
				data=fis.read();
				if(data==-1l) break;
				System.out.print((char)data);
			}
			
			fis.close();	// inputStream 종료
			
			System.out.println("\n-----------------------------------------------------------");
			
			
			// 2) Character 기반 Stream (2byte 문자 안깨짐)
			System.out.println("Character 기반 : ");
			FileReader fr=new FileReader(path);

			data=0;
			while(true) {
				data=fr.read();
				if(data==-1l) break;
				System.out.print((char)data);
			}
			
			fr.close();
			
			
		}catch(Exception ex) {
			System.out.println(ex+"\n파일 정보를 읽어올 수 없습니다.");
		}
		

	}

}
