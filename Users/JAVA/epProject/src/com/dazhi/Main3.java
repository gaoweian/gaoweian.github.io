package com.dazhi;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "sdfsadfgsdg";
		System.out.println("Ҫ��ѯ����ĸ");
		char c = sc.next().charAt(0);
		System.out.println(new Main3().lastIndexof(s, c));
	}
	public int lastIndexof(String s,char c){
		char [] chars = s.toCharArray();
		for(int i=0;i<chars.length;i++){
			if(c == chars[i]){
				return chars.length-i;
			}
		}
		return -1;
	}

}