package com.hcl.myjdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			String CREAT_SQL_QUERY="create table productss(pid int, pname varchar(30))";
			String INSERT_SQL_QUERY="insert into productss(pid, pname) values(123, 'Computer')";
			String SELECT_SQL_QUERY="select * from productss";
			String url = "jdbc:mysql://localhost:3306/shubhamdb";
			String username = "root";
			String password = "root";
			//Step:1- Load the Driver class.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step:2- Make the Connection Object.
			Connection con = DriverManager.getConnection(url,username,password);
			//cstep:3- Make the Statement object.
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_SQL_QUERY);
			while(rs.next()) {
				int productId = rs.getInt("pid");
				String productName = rs.getString("pname");
				System.out.println(productId + " : " + productName);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
