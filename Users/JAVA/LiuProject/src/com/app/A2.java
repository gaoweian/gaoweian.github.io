package com.app;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A2 {

    public static void main(String[] args) {
        A2 a2 = new A2();

        //����F���е�abc.txt �ĵ�
        String filePath = "F:/abc.txt" ;

        //Ҫд�������
        String content = "������2017/4/19,�����ܺ�" ;
        a2.writeFile( filePath , content  ) ;

    }

    /**
     * �����ļ�·�����������
     * @param filePath �� �ļ���·��
     * @param content : ��Ҫд�������
     */
    public void writeFile( String filePath , String content ){
        FileOutputStream fos = null ;
        try {
            //1�������ļ�·�����������
            fos  = new FileOutputStream( filePath );

            //2����stringת��Ϊbyte���飻
            byte[] array = content.getBytes() ;
            //3����byte���������
            fos.write( array );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}