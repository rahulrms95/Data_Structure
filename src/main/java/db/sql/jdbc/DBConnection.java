package db.sql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	static String  url = "jdbc:mysql://localhost:3306/testdb";
	static String user = "root";
	static String password = "Passw@rd123";
	private static Connection con = null;
	
	/**
	 * To Get Database Connection Object 
	 * To create JDBC Connection 
	 * **/
	public static Connection getConnection()
	{
		if(con == null)
		{
			synchronized (con) {
				if(con == null)
				{
					try {
						con = DriverManager.getConnection(url,user,password);
						//Statement stm = con.createStatement();
						//stm.execute("create table users (name varchar(50),age int, userid varchar(50) primary key);");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		return con;
	}

	public static void main(String[] args) {

		getConnection();
	}
}
