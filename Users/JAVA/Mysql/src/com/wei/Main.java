package com.wei;

import java.sql.Connection;
import java.sql.SQLException;

import com.gao.Demo;
import com.mysql.jdbc.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		Connection con = Demo.getInstace();
		Connection con2 = Demo.getInstace();
		try {
			new Thread(new Xiancheng1(con)).start();
			new Thread(new Xiancheng2(con2)).start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
