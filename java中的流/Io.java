package io;

import java.io.IOException;

public class Io {

	public static void main(String[] args) {
		System.out.println("hello");
		byte[] buffer = new byte[1024];//�ֽ�����
		int len;
		try {
			len = System.in.read(buffer); // System.in���ֽڵ���ʽ����
			String s = new String(buffer,0,len);
			System.out.println("�����"+len+"���ֽ�");
			System.out.println(s);
			System.out.println(s.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
