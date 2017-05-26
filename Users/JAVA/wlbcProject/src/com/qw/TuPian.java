package com.qw;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TuPian {

	public static void main(String[] args) {
		String url = "http://pic10.nipic.com/20100929/4308872_150108084472_2.jpg";
		try {
			URL realUrl = new URL(url);
			URLConnection conn = realUrl.openConnection();
			conn.connect();
			InputStream i =  conn.getInputStream();
			
			byte[] b = new byte[1024];
			int len = 0;
			File file =new File("src/1.jpg");
			FileOutputStream out = new FileOutputStream(file);
			while((len = i.read(b))!=-1){
				out.write(b,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
