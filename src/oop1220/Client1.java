package oop1220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client1 {		// 클라이언트 구축
	public static void main(String[] args) {
		
		System.out.println("[ JJA - Client1 ]"+"\n");
		
		Socket socket=null;
		
		try {

			// cmd> java Client1 172.16.10.100
			socket=new Socket(args[0],2019);
			System.out.println("[접속] 서버IP : "+socket.getInetAddress().getHostAddress());
			BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String line=reader.readLine();
			String list[]=line.split("/");
			
			System.out.println("----------------------------------");
			for(int i=0;i<list.length;i++) System.out.println(list[i]);
			System.out.println("----------------------------------");
			
			
		}catch(Exception e) {
			System.out.println("오류 발생 (code 1) : \n"+e);
		}
		finally {
			try {
				socket.close();
			}catch(Exception e) {
				System.out.println("오류 발생 (code 2) : \n"+e);
			}
			System.out.println("\n클라이언트 프로그램 실행을 종료합니다.");
		}
		
		
	}
}
