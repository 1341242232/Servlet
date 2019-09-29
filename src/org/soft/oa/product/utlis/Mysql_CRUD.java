package org.soft.oa.product.utlis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.soft.oa.product.model.Inventory;

public class Mysql_CRUD extends Mysql_Jdbc{

	private static Connection connection = null;
	private static PreparedStatement preparedStatement = null;
	
	public boolean execute_Insert_Update_Delete(String sql,Object [] objects) {
		boolean b = false;
		connection = getConnection();
		try {
			preparedStatement =  connection.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				preparedStatement.setObject(i+1, objects[i]);
			}
			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				b = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return b;
	}
	
	public ResultSet execute_Query(String sql,Object [] objects) {
		connection = getConnection();
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(sql);
			if (objects != null) {
				for (int i = 0; i < objects.length; i++) {
					preparedStatement.setObject(i+1, objects[i]);
				}
			}
			 resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public void close_ResultSet(ResultSet resultSet) {
		close(resultSet, preparedStatement, connection);
	}

}
