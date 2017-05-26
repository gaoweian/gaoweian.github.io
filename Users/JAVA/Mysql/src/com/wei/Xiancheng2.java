package com.wei;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;

public class Xiancheng2 implements Runnable{
	Connection con2;
	public Xiancheng2(Connection con){
		this.con2 = con;
	}
	public void run() {
		try {
			con2.setAutoCommit(false);
			PreparedStatement p = (PreparedStatement) con2.prepareStatement("update xiancheng set money = ? where id = ?");
			p.setInt(1,4000);
			p.setInt(2, 12);
			p.executeUpdate();
			con2.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con2.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}finally{
			new Demo().show(con2);
		}	
	}

}
