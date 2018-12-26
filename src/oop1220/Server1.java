package oop1220;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {		// 서버 구축
	public static void main(String[] args) {
		
		System.out.println("[ JJA - Server1 ]"+"\n");
		
		
		ServerSocket server=null;
		
		try {
			
			// Port Number : 1004	(범위 0~65535, System Port 제외)
			server=new ServerSocket(1004);
			
			System.out.println("서버 프로그램 실행을 시작합니다.\n");
			
			while(true) {
				
				System.out.println("클라이언트 접속 대기중 ...");
				
				Socket socket=server.accept();
				System.out.println("[접속] 접속IP : "+socket.getInetAddress().getHostAddress());

				String me="[진아]";
				
				BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write(me+"/"+"보헤미안 랩소디"+"/"+"점심 뭐먹지");
				writer.newLine();
				writer.flush();		// client에 전송
				socket.close();		// 접속자 연결 종료
				
			}
			
			
			
		}catch(Exception e) {
			System.out.println("오류 발생 (code 1) : \n"+e);
		}
		finally {
			try {
				server.close();
			}catch(Exception e) {
				System.out.println("오류 발생 (code 2) : \n"+e);
			}
			System.out.println("\n서버 프로그램 실행을 종료합니다.");
		}
		
		
	}
}
