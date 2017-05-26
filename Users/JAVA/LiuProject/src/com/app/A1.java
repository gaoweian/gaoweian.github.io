package com.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A1 {

    public static void main(String[] args) {
        A1 a1 = new A1();
    
        //����F���е�abc.txt �ĵ�
        String filePath = "F:/abc.txt" ;
        String reslut = a1.readFile( filePath ) ;
        System.out.println( reslut ); 
    }


    /**
     * ��ȡָ���ļ�������
     * @param filePath �� �ļ���·��
     * @return  ���صĽ��
     */
    public String readFile( String filePath ){
        FileInputStream fis=null;
        String result = "" ;
        try {
            // ����path·��ʵ����һ���������Ķ���
            fis  = new FileInputStream( filePath );

            //2. ��������������п��Ա�����ʣ�µ�bytes�ֽڵĹ���ֵ��
            int size =  fis.available() ;
            //3. �����������е��ֽ�������byte���飻
            byte[] array = new byte[size];
            //4.�����ݶ�ȡ�������У�
            fis.read( array ) ; 

            //5.���ݻ�ȡ����Byte�����½�һ���ַ�����Ȼ�������
            result = new String(array); 

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return result ;
    }


}
