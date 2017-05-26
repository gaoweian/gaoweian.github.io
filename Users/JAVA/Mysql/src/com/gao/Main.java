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
       //声明Connection对象
       Connection con = null;
       //驱动程序名
       String driver = "com.mysql.jdbc.Driver";
       //URL指向要访问的数据库名sqltestdb
       String url = "jdbc:mysql://localhost:3306/sqltestdb";
       //MySQL配置时的用户名
       String user = "root";
       //MySQL配置时的密码
       String password = "123";
       //遍历查询结果集
       try {
           //加载驱动程序
    	   Class.forName(driver);
    	   //1.getConnection()方法，连接MySQL数据库！！
    	   con = DriverManager.getConnection(url,user,password);
    	   if(!con.isClosed())
    		   System.out.println("Succeeded connecting to the Database!");
               //2.创建statement类对象，用来执行SQL语句！！
          	   Statement statement = con.createStatement();
          	   //要执行的SQL语句
          	   String sql = "select * from emp";
          	   //3.ResultSet类，用来存放获取的结果集！！
          	   ResultSet rs = statement.executeQuery(sql);
          	   System.out.println("-----------------");
          	   System.out.println("执行结果如下所示:");  
          	   System.out.println("-----------------");  
          	   System.out.println("姓名" + "\t" + "职称");  
          	   System.out.println("-----------------");  
	           String job = null;
	           String id = null;
	           while(rs.next()){
	        	   //获取stuname这列数据
	        	   job = rs.getString("job");
	        	   //获取stuid这列数据
	        	   id = rs.getString("ename");
	        	   //输出结果
	        	   System.out.println(id + "\t" + job);
	           }
	           rs.close();
	           con.close();
        } catch(Exception e) {   
        	//数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!"); 
          //数据库连接失败异常处理
            e.printStackTrace();
       }finally{
           System.out.println("数据库数据成功获取！！");
       }
       //增加
       String name;
       String id;
       PreparedStatement psql;
       ResultSet res;
       //预处理添加数据，其中有两个参数--“？”
       try {
		psql = (PreparedStatement) con.prepareStatement("insert into emp(empno,ename,job,hiredate,sal)"
				   +"values(?,?,?,?,?)");
		//psql = setInt(1,3212);
		psql.setString(2, "王刚");
		psql.setString(3,"总裁");
		
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
