package com.wei;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class Demo2 {
	
	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
	    	//1.����Connection���� getConnection()����������MySQL���ݿ⣡��
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","123");
			con.setAutoCommit(false);//��������
			PreparedStatement p = (PreparedStatement) con.prepareStatement("update xiancheng set money = ? where id = ?");//�޸�
			p.setInt(1,5000);
			p.setInt(2, 11);
			p.executeUpdate();//�����޸�����
			con.commit();//�ύ����
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();//�ع�(���޸ĳ������ع������״̬)
				System.out.println("111");
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

}