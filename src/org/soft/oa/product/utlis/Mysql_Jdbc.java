package org.soft.oa.product.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql_Jdbc {

	private final static String  driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/OA?useUnicode=true&characterEncoding=UTF-8";
	private final static String user = "root";
	private final static String password = "admin";
	private static Connection connection = null;

	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public void close(ResultSet resultSet,Statement statement,Connection conn) {
		if (resultSet != null) {
			try {
				resultSet.close();
				resultSet = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if (statement != null) {
					try {
						statement.close();
						statement = null;
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}finally {
						if (conn != null) {
							try {
								conn.close();
								conn = null;
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
			
		}
	}
	
}
