package com.gao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	private static Connection con = null;
	public static Connection getInstace(){
		try {
			//����������
			String driver = "com.mysql.jdbc.Driver";
			//������������
	    	Class.forName(driver);
	    	//1.����Connection���� getConnection()����������MySQL���ݿ⣡��
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;		
	}
}
