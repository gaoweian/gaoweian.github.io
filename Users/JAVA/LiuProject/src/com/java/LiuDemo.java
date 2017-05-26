package com.java;
import java.io.File ;      
public class LiuDemo {
	public static void main(String[] args) {
		File f= new File("src/com") ;
		try{
			f.createNewFile();
			fandFiles(f);
	 	}catch(Exception e){
		 e.printStackTrace();
	 	}
	}
	public static  void fandFiles(File f1){
		if(f1.isDirectory() ){
			File[] f2 = f1.listFiles();
			for(File s:f2){
				fandFiles(s);
				//System.out.println(f1.getAbsolutePath());
			}
		}else{
			if(f1.getName().endsWith(".java")){
				System.out.println(f1);
			}
		}
	}
}

