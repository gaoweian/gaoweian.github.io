package com.dazhi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Map map = new HashMap();
		int a=0;
		Scanner sc = new Scanner(System.in);
		String s = "sdfsadfgsdg";
		System.out.println("Òª²éÑ¯µÄ×ÖÄ¸");
		char c = sc.next().charAt(0);
		char [] chars = s.toCharArray();
		for(int i=0;i<chars.length;i++){
//			if(c == chars[i]){
//				a++;
//			}
			map.put(i, chars[i]);
		}
		System.out.println(c+":"+a);
		Set keys = map.keySet();
		Iterator i = keys.iterator();
		while(i.hasNext()){
			int key = (int)i.next();
			char value = (char)map.get(key);
			if(c==value){
				a++;
			}
		}
		System.out.println(c+":"+a);
	}
}
