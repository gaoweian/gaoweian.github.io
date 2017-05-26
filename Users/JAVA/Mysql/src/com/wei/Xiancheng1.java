package com.wei;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Xiancheng1 implements Runnable{
	Connection con;
	public Xiancheng1(Connection con){
		this.con = con;
	}
	public void run() {
		try {
			con.setAutoCommit(false);
			PreparedStatement p = (PreparedStatement) con.prepareStatement("update xiancheng set money = ? where id = ?");
			p.setInt(1,5000);
			p.setInt(2, 11);
			p.executeUpdate();
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}finally{
				new Demo().show(con);
			}
		}
	}
}
