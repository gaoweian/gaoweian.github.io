package com.dazhi;

import java.io.File ;    
import java.io.InputStream ;    
import java.io.FileInputStream ;    
public class InputStreamDemo04{    
    public static void main(String args[]) throws Exception{    // �쳣�׳���������     
        // ��1����ʹ��File���ҵ�һ���ļ�     
        File f= new File("d:" + File.separator + "test.txt") ;  // ����File����     
        // ��2����ͨ������ʵ�����������     
        InputStream input = null ;  // ׼����һ������Ķ���     
        input = new FileInputStream(f)  ;   // ͨ�������̬�ԣ�����ʵ����     
        // ��3�������ж�����     
        byte b[] = new byte[(int)f.length()] ;      // �����С���ļ�����     
        for(int i=0;i<b.length;i++){    
            b[i] = (byte)input.read() ;     // ��ȡ����     
        }    
        // ��4�����ر������     
        input.close() ;                     // �ر������\     
        System.out.println("����Ϊ��" + new String(b)) ;    // ��byte�����Ϊ�ַ������     
    }    
}
