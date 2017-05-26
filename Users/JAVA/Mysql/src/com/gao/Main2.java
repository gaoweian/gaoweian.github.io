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
public class Main2 {
	public static void main(String[] args) {
		//new Main2().select();
		// new Main2().delete();
		// new Main2().update();
		// new Main2().add();
	}
	//����
    public void add(){
    	 //Ҫִ�е�SQL���
    	try {
	    	
			PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("insert into emp (empno,ename,job,hiredate,sal) "
			        + "values(?,?,?,?,?)");
		   	psql.setInt(1, 3212);              //���ò���1������idΪ3212������
		   	psql.setString(2, "����");      //���ò���2��name Ϊ����
		   	psql.setString(3, "�ܲ�");
		   	 
		   	DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		   	Date myDate2 = dateFormat2.parse("2010-09-13");
		   	psql.setDate(4,new java.sql.Date(myDate2.getTime()));
		   	psql.setFloat(5, (float) 2000.3);
		   	psql.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
    //ɾ��
    public void delete(){
    	//Ԥ����ɾ������
    	try {
	    	PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("delete from emp where empno = ?");
			psql.setFloat(1, 7369);
	    	psql.executeUpdate();
	    	psql.close();
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //�޸�
    public void update(){
    	try {
	    	//Ԥ������£��޸ģ����ݣ������յ�sal��Ϊ5000.0
	    	PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("update emp set sal = ? where ename = ?");
	    	psql.setFloat(1,(float) 5000.0);      
	    	psql.setString(2,"����");             
	    	psql.executeUpdate();
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //��ѯ
    public void select(){
    	//������ѯ�����
        try {
     	   //1.����Connection���� getConnection()����������MySQL���ݿ⣡��
     	   Connection con = Demo.getInstace();
     	   if(!con.isClosed())
     		   System.out.println("Succeeded connecting to the Database!");
                //2.����statement���������ִ��SQL��䣡��
           	   Statement statement = con.createStatement();
           	   //Ҫִ�е�SQL���
           	   String sql = "select * from emp";
           	   //3.ResultSet�࣬������Ż�ȡ�Ľ��������
           	   ResultSet rs = statement.executeQuery(sql);
 	           while(rs.next()){
 	        	   //��ȡename��������
 	        	   String ename = rs.getString("ename");
 	        	   //��ȡjob��������
 	        	   String job = rs.getString("job");
 	        	   //������
 	        	   System.out.println(ename + "\t" + job);
 	           }
 	           rs.close();
 	           con.close();
         } catch(Exception e) {   
         	//���ݿ��������쳣����
             //System.out.println("Sorry,can`t find the Driver!"); 
           //���ݿ�����ʧ���쳣����
             e.printStackTrace();
        }finally{
            System.out.println("���ݿ����ݳɹ���ȡ����");
        }
    }
}
