package org.soft.oa.product.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.soft.oa.product.Dao.TestUserDao;
import org.soft.oa.product.model.TestUser;
import org.soft.oa.product.utlis.Mysql_CRUD;

public class TestUserDaoImp extends Mysql_CRUD implements TestUserDao{

	@Override
	public TestUser login(TestUser testUser) {
		String userAccount = testUser.getUserAccount();
		String userPassword = testUser.getUserPassword();
		String userSql = "SELECT * FROM user WHERE userAccount = ? AND userPassword = ?";
		Object [] objects = {userAccount,userPassword};
		ResultSet resultSet = execute_Query(userSql, objects);
		try {
			if (resultSet.next()) {
				testUser = new TestUser(0, userAccount, userPassword);
				System.out.println(testUser);
			}else {
				testUser = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close_ResultSet(resultSet);
		}
		return testUser;
	}


}
