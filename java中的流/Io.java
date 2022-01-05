package io;

import java.io.IOException;

public class Io {

	public static void main(String[] args) {
		System.out.println("hello");
		byte[] buffer = new byte[1024];//字节类型
		int len;
		try {
			len = System.in.read(buffer); // System.in以字节的形式读入
			String s = new String(buffer,0,len);
			System.out.println("输出了"+len+"个字节");
			System.out.println(s);
			System.out.println(s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
