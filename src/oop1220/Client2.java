package oop1220;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) {

		System.out.println("[ JJA - Client2 ]" + "\n");
		
		
		Socket socket = null;
		
		try {
			socket = new Socket(args[0], 1004);
			System.out.println("[접속] 서버 IP: " + socket.getInetAddress().getHostAddress()); // 접속 정보 추출

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write("[여행 추천]/무등산 전망대/죽녹원/보성 녹차밭");
			writer.newLine();
			writer.flush();

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				socket.close();
			} catch (Exception ignored) {
			}
		}

		System.out.println("Client 프로그램 실행을 종료합니다.");
	}
}// class end