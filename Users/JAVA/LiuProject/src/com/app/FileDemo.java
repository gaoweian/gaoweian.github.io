package com.app;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws FileNotFoundException {
		File f= new File("F:/test.txt") ;
		
		 	try{
		 		FileInputStream fi = new FileInputStream(f);
		 		byte [] b = new byte[10];
		 		fi.read(b);
		 		int len=0;
		 		 String bn ="" ;
		 		while((len = fi.read(b))!=-1){
		 			String bn1=(new String(b,0,len));
		 		}
		 		//f.createNewFile();
		 	}catch(Exception e){
			 e.printStackTrace();
		 	}
		 	//System.out.println(f.length());
		 
			
		 	//File f= new File("F:/test.txt") ;
		 	//fandFiles( f);
	}
	/*public static  void fandFiles(File f){
		if(f.isFile() ){
			File []f1 = new File[];
			for(File s:f1){
				System.out.println(s.getAbsoluteFile());
			}
		}
	}*/

	

}
