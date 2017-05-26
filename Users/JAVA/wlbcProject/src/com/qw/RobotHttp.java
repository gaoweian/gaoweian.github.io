package com.qw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class RobotHttp {
	public static void main(String[] args) {
		while(true){
			Scanner sc = new Scanner(System.in);
			//链接地址
			String url = "http://www.tuling123.com/openapi/api?key=f932c5b5a6eb48a69fecf07b638802e9&info="+sc.next();
			try {
				//创建URL对象
				URL realUrl = new URL(url);
				//打开URL
				URLConnection conn = realUrl.openConnection();
				//发起链接请求
				conn.connect();
				//获取返回内容
				BufferedReader r = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				StringBuffer s = new StringBuffer();
				String st = "";
				st = r.readLine();
				String[] string = st.split(":");
				String[] strings = string[2].split("\"");
				System.out.println(strings[1]);
				//st = r.readLine();
				//System.out.println(st);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
