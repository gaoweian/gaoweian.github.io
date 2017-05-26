package com.dazhi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		while(true){
			SimpleDateFormat s = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
			System.out.println(s.format(new Date()));
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
