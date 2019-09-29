package org.soft.oa.product.Factory;

import org.soft.oa.product.Dao.InventoryDao;
import org.soft.oa.product.Dao.TestUserDao;
import org.soft.oa.product.DaoImp.InventoryDaoImp;
import org.soft.oa.product.DaoImp.TestUserDaoImp;

public class Factory {

	private static Factory factory = null;
	private InventoryDao inventoryDao;
	private TestUserDao testUserDao;
	
	public static Factory getFactory() {
		if (factory == null) {
			factory = new Factory();
		}
		return factory;
	}
	
	public InventoryDao getInventoryDao() {
		if (inventoryDao == null) {
			inventoryDao = new InventoryDaoImp();
		}
		return inventoryDao;
	}
	
	public TestUserDao geTestUserDao() {
		if (testUserDao == null) {
			testUserDao = new TestUserDaoImp();
		}
		return testUserDao;
	}
}
