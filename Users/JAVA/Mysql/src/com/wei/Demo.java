package com.wei;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class Demo {
	private static LinkedList<Connection> list = new LinkedList<Connection>();
	static{
		try {
			for(int i=0;i<10;i++){
				//������������
		    	Class.forName("com.mysql.jdbc.Driver");
		    	//1.����Connection���� getConnection()����������MySQL���ݿ⣡��
		    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
				if(!con.isClosed()){
					list.add(con);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	//��
	public static Connection getInstace(){
		while(true){
			synchronized (list) {
				if(list.size()>0){
					return list.removeFirst();
				}else{
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			return null;
		}
	}
	//��
	public void show(Connection con){
		synchronized (list) {
			list.add(con);
			list.notifyAll();
		}
	}
}
