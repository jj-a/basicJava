package oop1205;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - FileTest ]"+"\n");
		
		String filename="data.txt";
		String path="src\\oop1205";
		
		try {
			
			File file=new File(path+"\\"+filename);
			
			if(file.exists()) {
				System.out.println("--파일 로딩 완료--");
				
				System.out.println(filename);
				String cut[]=file.getName().split("[.]");		// 정규표현식에 의해 "\\." or "[.]" 으로 사용
				String fname=cut[0];
				String fextension=cut[1];
				
				System.out.println("파일명: "+fname);
				System.out.println("확장자: "+fextension);
				System.out.println("경로: "+file.getPath());
				System.out.print("파일 크기: ");
				if(file.length()>=Math.pow(1024,2)) System.out.printf("%.2f MB\n",(double)file.length()/Math.pow(1024,2));	// mb
				else if(file.length()>=1024) System.out.printf("%.2f KB\n",(double)file.length()/1024);	// kb
				else System.out.printf(file.length()+" Byte\n");	// byte
			}
			else System.out.println("--파일 로딩 실패--");
			
			//System.out.println("파일 삭제를 실행합니다.");
			//file.delete();		// 파일 삭제
			
		}catch(Exception ex) {
			System.out.println(ex+"\n파일 정보를 읽어올 수 없습니다.");
		}
		
		System.out.println("\n--수행 완료--");
		
	}
}
