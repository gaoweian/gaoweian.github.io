package com.dazhi;

import java.io.File ;    
import java.io.Writer ;    
import java.io.FileWriter ;    
public class WriterDemo03{    
    public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        Writer out = null ; // ׼����һ������Ķ���     
        out = new FileWriter(f)  ;  // ͨ�������̬�ԣ�����ʵ����     
        // ��3��������д����     
        String str = "Hello World!!!" ;     // ׼��һ���ַ���     
        out.write(str) ;                        // ����������������ļ�     
        // ��4�����ر������     
        // out.close() ;                        // ��ʱ��û�йر�     
    }    
}
