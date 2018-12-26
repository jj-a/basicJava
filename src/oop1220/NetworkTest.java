package oop1220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class NetworkTest {
	public static void main(String[] args) {
		
		System.out.println("[ JJA - NetworkTest ]"+"\n");
		
		try {
			
			InetAddress ip=InetAddress.getByName("www.soldesk.com");
			
			System.out.println("Host Name: "+ip.getHostName());
			System.out.println("Host Address: "+ip.getHostAddress());
			//System.out.println("Local Host: "+ip.getLocalHost());
			
			System.out.println();

			ip=InetAddress.getByName("www.daum.net");
			
			System.out.println("Host Name: "+ip.getHostName());
			System.out.println("Host Address: "+ip.getHostAddress());
			
			
			String address="http://www.soldesk.com";
			URL url=new URL(address);
			
			String line="";
			BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
			
			while(true) {
				line=br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			
			
		}catch(Exception e) {
			System.out.println("오류 발생 : \n"+e);
		}
		
	}
}
