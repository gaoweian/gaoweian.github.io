package com.dazhi;

import java.io.File ;    
import java.io.OutputStream ;    
import java.io.FileOutputStream ;    
public class OutputStreamDemo05{    
	public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        OutputStream out = null ;   // ׼����һ������Ķ���     
        out = new FileOutputStream(f)  ;    // ʵ����     
        // ��3��������д����     
        String str = "Hello World!!!" ;     // ׼��һ���ַ���     
        byte b[] = str.getBytes() ;         // ֻ�����byte���飬���Խ��ַ�����Ϊbyte����     
        out.write(b) ;      // д������     
        // ��4�����ر������     
        // out.close() ;                        // �ر������     
    }    
}