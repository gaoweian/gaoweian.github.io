package com.dazhi;

import java.io.* ;    
public class Copy{    
    public static void main(String args[]){    
        if(args.length!=2){     // �ж��Ƿ�����������     
            System.out.println("����Ĳ�������ȷ��") ;    
            System.out.println("����java Copy Դ�ļ�·�� Ŀ���ļ�·��") ;    
            System.exit(1) ;    // ϵͳ�˳�     
        }    
        File f1 = new File(args[0]) ;   // Դ�ļ���File����     
        File f2 = new File(args[1]) ;   // Ŀ���ļ���File����     
        if(!f1.exists()){    
            System.out.println("Դ�ļ������ڣ�") ;    
            System.exit(1) ;    
        }    
        InputStream input = null ;      // ׼�������������󣬶�ȡԴ�ļ�     
        OutputStream out = null ;       // ׼�������������д��Ŀ���ļ�     
        try{    
            input = new FileInputStream(f1) ;    
        }catch(FileNotFoundException e){    
            e.printStackTrace() ;    
        }    
        try{    
            out = new FileOutputStream(f2) ;    
        }catch(FileNotFoundException e){    
            e.printStackTrace() ;    
        }    
        if(input!=null && out!=null){   // �ж����������Ƿ�׼����     
            int temp = 0 ;      
            try{    
                while((temp=input.read())!=-1){ // ��ʼ����     
                    out.write(temp) ;   // �߶���д     
                }    
                System.out.println("������ɣ�") ;    
            }catch(IOException e){    
                e.printStackTrace() ;    
                System.out.println("����ʧ�ܣ�") ;    
            }    
            try{    
                input.close() ;     // �ر�     
                out.close() ;       // �ر�     
            }catch(IOException e){    
                e.printStackTrace() ;    
            }    
        }    
    }       
} 
