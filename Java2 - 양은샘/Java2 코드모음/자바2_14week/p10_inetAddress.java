package 자바2_14week;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;

public class p10_inetAddress {
	public static void main(String[] args) {// 예외처리를 throws Exception으로 해줌
		try {// 내 컴퓨터 주소를 알 수 있는 프로그램 
			InetAddress local = InetAddress.getLocalHost();//내 IP주소 
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
			InetAddress[] nn = InetAddress.getAllByName("www.naver.net");
			InetAddress[] nc = InetAddress.getAllByName("www.naver.com");
			InetAddress[] dn = InetAddress.getAllByName("www.daum.net");
			for (InetAddress remote : nn)
				System.out.println(remote);
			for (InetAddress remote : nc)
				System.out.println(remote);
			for (InetAddress remote : dn)
				System.out.println(remote);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}


