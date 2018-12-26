package oop1205;

import java.io.*;

public class InputTest1 {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - InputTest1 ]"+"\n");

		String path="./src\\oop1205\\data.txt";
		path="./src\\oop1205\\FileTest.java";		// 상대경로 top=프로젝트 폴더 주소
		// ** file 인코딩과 eclipse 인코딩 일치시키기 (utf-8 = utf-8)
		
		try {
			
			FileReader fr=new FileReader(path);
			BufferedReader br=new BufferedReader(fr);		// Buffer(char[])를 사용하는 라인 단위 보조 스트림
			
			int num=0;
			while(true) {
				String line=br.readLine();
				if(line==null) break;
				System.out.printf("%-5d %s\n",++num,line);
			}
			
			System.out.println("\n-----------------------------------------------------------");
			System.out.println("라인 수: "+num);
			
			// Reader 종료 (BufferedReader 먼저 종료)
			br.close();
			fr.close();
			
		}catch(Exception ex) {
			System.out.println(ex+"\n파일 정보를 읽어올 수 없습니다.");
		}
		
		
	}
}
