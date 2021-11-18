package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		OUT: // 标号指下面的双重循环
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(2*i+3*j == 15) {
					System.out.println("i = "+i+", j = "+j);
					break OUT; // 退出标号所指的双重循环
				}
			}
		}
	}

}
