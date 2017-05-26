package com.gao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mysql.jdbc.PreparedStatement;
public class Main {
	public static void main(String[] args) {
       //����Connection����
       Connection con = null;
       //����������
       String driver = "com.mysql.jdbc.Driver";
       //URLָ��Ҫ���ʵ����ݿ���sqltestdb
       String url = "jdbc:mysql://localhost:3306/sqltestdb";
       //MySQL����ʱ���û���
       String user = "root";
       //MySQL����ʱ������
       String password = "123";
       //������ѯ�����
       try {
           //������������
    	   Class.forName(driver);
    	   //1.getConnection()����������MySQL���ݿ⣡��
    	   con = DriverManager.getConnection(url,user,password);
    	   if(!con.isClosed())
    		   System.out.println("Succeeded connecting to the Database!");
               //2.����statement���������ִ��SQL��䣡��
          	   Statement statement = con.createStatement();
          	   //Ҫִ�е�SQL���
          	   String sql = "select * from emp";
          	   //3.ResultSet�࣬������Ż�ȡ�Ľ��������
          	   ResultSet rs = statement.executeQuery(sql);
          	   System.out.println("-----------------");
          	   System.out.println("ִ�н��������ʾ:");  
          	   System.out.println("-----------------");  
          	   System.out.println("����" + "\t" + "ְ��");  
          	   System.out.println("-----------------");  
	           String job = null;
	           String id = null;
	           while(rs.next()){
	        	   //��ȡstuname��������
	        	   job = rs.getString("job");
	        	   //��ȡstuid��������
	        	   id = rs.getString("ename");
	        	   //������
	        	   System.out.println(id + "\t" + job);
	           }
	           rs.close();
	           con.close();
        } catch(Exception e) {   
        	//���ݿ��������쳣����
            System.out.println("Sorry,can`t find the Driver!"); 
          //���ݿ�����ʧ���쳣����
            e.printStackTrace();
       }finally{
           System.out.println("���ݿ����ݳɹ���ȡ����");
       }
       //����
       String name;
       String id;
       PreparedStatement psql;
       ResultSet res;
       //Ԥ����������ݣ���������������--������
       try {
		psql = (PreparedStatement) con.prepareStatement("insert into emp(empno,ename,job,hiredate,sal)"
				   +"values(?,?,?,?,?)");
		//psql = setInt(1,3212);
		psql.setString(2, "����");
		psql.setString(3,"�ܲ�");
		
		DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
		Date myDate = da.parse("2010-09-13");	
		psql.setDate(4,new java.sql.Date(myDate.getTime()));
		psql.setFloat(5,(float)2000.3);
		psql.executeUpdate();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
    }



	

	
	
}
