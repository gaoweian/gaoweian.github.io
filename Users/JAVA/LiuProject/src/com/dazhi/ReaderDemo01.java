package com.dazhi;

import java.io.File ;    
import java.io.Reader ;    
import java.io.FileReader ;    
public class ReaderDemo01{    
    public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        Reader input = null ;   // ׼����һ������Ķ���     
        input = new FileReader(f)  ;    // ͨ�������̬�ԣ�����ʵ����     
        // ��3�������ж�����     
        char c[] = new char[1024] ;     // ���е����ݶ�����������֮��     
        int len = input.read(c) ;       // ��ȡ����     
        // ��4�����ر������     
        input.close() ;                     // �ر������     
        System.out.println("����Ϊ��" + new String(c,0,len)) ;  // ���ַ������Ϊ�ַ������     
    }    
}
