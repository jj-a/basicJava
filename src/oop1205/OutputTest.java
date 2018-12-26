package oop1205;

import java.io.*;

public class OutputTest {

	public static void main(String[] args) {
		
		System.out.println("[ JJA - OutputTest ]"+"\n");

		String filename="./src\\oop1205\\output.txt";

		try {

			// FileWriter(File file, Boolean append)
			// = 출력파일이 메모리공간에 존재하지 않으면 파일 생성, 존재하면 T)추가(append) / F)덮어쓰기(overwrite) 선택
			FileWriter fw=new FileWriter(filename,false);
			PrintWriter out=new PrintWriter(fw,true);		// PrintWriter(Writer out, boolean autoFlush) - 자동 버퍼 여부
			
			out.println("연,85,80,80");
			out.println("락,50,60,99");
			out.println("택,100,100,90");
			out.println("묵,95,95,95");
			out.println("백,70,60,50");
			out.println();

			System.out.println("output.txt 파일에 데이터가 저장되었습니다.");
			
			// Writer 종료 (PrintWriter 먼저 종료)
			out.close();
			fw.close();
			
			
		}catch(Exception ex) {
			System.out.println(ex+"\n파일을 쓸 수 없습니다.");
		}
		
		
	}

}
