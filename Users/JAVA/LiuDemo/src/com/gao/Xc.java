package com.gao;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.RandomAccessFile;


public class Xc implements Runnable{
		int a;
		int z;
		File file = null;
		RandomAccessFile randomaccessfile=null;
		public Xc(int a,int z,File file){
			this.a=a;
			this.z=z;
			this.file=file;
		}
		public void run(){
			int i = 0;
			try{
			randomaccessfile = new RandomAccessFile(file,"rw");
			randomaccessfile.seek(a);
			byte[] b = new byte[1024];//»º³åÇø
			int len = 0;
			StringBuffer sb = new StringBuffer();
			while((len = randomaccessfile.read(b))!=-1){
				sb.append(new String(b,0,z));
				if(i==z){
					break;
				}
			}
			System.out.println(sb.toString());//Êä³ö
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
