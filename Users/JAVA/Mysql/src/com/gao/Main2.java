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
	//增加
    public void add(){
    	 //要执行的SQL语句
    	try {
	    	
			PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("insert into emp (empno,ename,job,hiredate,sal) "
			        + "values(?,?,?,?,?)");
		   	psql.setInt(1, 3212);              //设置参数1，创建id为3212的数据
		   	psql.setString(2, "王刚");      //设置参数2，name 为王刚
		   	psql.setString(3, "总裁");
		   	 
		   	DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		   	Date myDate2 = dateFormat2.parse("2010-09-13");
		   	psql.setDate(4,new java.sql.Date(myDate2.getTime()));
		   	psql.setFloat(5, (float) 2000.3);
		   	psql.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
    //删除
    public void delete(){
    	//预处理删除数据
    	try {
	    	PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("delete from emp where empno = ?");
			psql.setFloat(1, 7369);
	    	psql.executeUpdate();
	    	psql.close();
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //修改
    public void update(){
    	try {
	    	//预处理更新（修改）数据，将王刚的sal改为5000.0
	    	PreparedStatement psql = (PreparedStatement) Demo.getInstace().prepareStatement("update emp set sal = ? where ename = ?");
	    	psql.setFloat(1,(float) 5000.0);      
	    	psql.setString(2,"王刚");             
	    	psql.executeUpdate();
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
    //查询
    public void select(){
    	//遍历查询结果集
        try {
     	   //1.声明Connection对象， getConnection()方法，连接MySQL数据库！！
     	   Connection con = Demo.getInstace();
     	   if(!con.isClosed())
     		   System.out.println("Succeeded connecting to the Database!");
                //2.创建statement类对象，用来执行SQL语句！！
           	   Statement statement = con.createStatement();
           	   //要执行的SQL语句
           	   String sql = "select * from emp";
           	   //3.ResultSet类，用来存放获取的结果集！！
           	   ResultSet rs = statement.executeQuery(sql);
 	           while(rs.next()){
 	        	   //获取ename这列数据
 	        	   String ename = rs.getString("ename");
 	        	   //获取job这列数据
 	        	   String job = rs.getString("job");
 	        	   //输出结果
 	        	   System.out.println(ename + "\t" + job);
 	           }
 	           rs.close();
 	           con.close();
         } catch(Exception e) {   
         	//数据库驱动类异常处理
             //System.out.println("Sorry,can`t find the Driver!"); 
           //数据库连接失败异常处理
             e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
    }
}
