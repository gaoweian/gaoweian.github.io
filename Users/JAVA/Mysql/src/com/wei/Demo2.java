package com.wei;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Demo2 {
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
	    	//1.声明Connection对象， getConnection()方法，连接MySQL数据库！！
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
			con.setAutoCommit(false);//开启事务
			PreparedStatement p = (PreparedStatement) con.prepareStatement("update xiancheng set money = ? where id = ?");//修改
			p.setInt(1,5000);
			p.setInt(2, 11);
			p.executeUpdate();//返回修改内容
			con.commit();//提交事务
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();//回滚(若修改出错，回滚到最初状态)
				System.out.println("111");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}
