package org.soft.oa.product.DaoImp;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.soft.oa.product.Dao.InventoryDao;
import org.soft.oa.product.model.Inventory;
import org.soft.oa.product.utlis.Mysql_CRUD;

public class InventoryDaoImp extends Mysql_CRUD implements InventoryDao{

	@Override
	public boolean addProduct(Inventory inventory) {
		int  storageId = inventory.getStorageId();
		String iName = inventory.getiName();
		String iNumber = inventory.getiNumber();
		String iType = inventory.getiType();
		String iSpecification = inventory.getiSpecification();
		Date iDate = inventory.getiDate();
		String pId = inventory.getpId();
		String remark = inventory.getRemark();
		String transactor = inventory.getTransactor();
		String inventorySql = "INSERT INTO inventory(iName,iNumber,storageId,iType,iSpecification,iDate,pId,remark,transactor) "
				+ "VALUES (?,?,?,?,?,?,?,?,?)";
		Object [] objects = {iName,iNumber,storageId,iType,iSpecification,iDate,pId,remark,transactor};
		boolean b = execute_Insert_Update_Delete(inventorySql, objects);
		return b;
	}

	@Override
	public List<Inventory> queryInventoryList() {
		String inventorySql = "SELECT * FROM inventory";
		List<Inventory> list = new ArrayList<Inventory>();
		ResultSet resultSet = execute_Query(inventorySql, null);
		if (resultSet != null) {
			try {
				while(resultSet.next()) {
					int inventoryId  = resultSet.getInt("inventoryId");
					int storageId = resultSet.getInt("storageId");
					String iName = resultSet.getString("iName");
					String iNumber = resultSet.getString("iNumber");
					String iType = resultSet.getString("iType");
					String iSpecification = resultSet.getString("iSpecification");
					String remark = resultSet.getString("remark");
					String transactor = resultSet.getString("transactor");
					String date = resultSet.getString("iDate");
					String pId = resultSet.getString("pId");
					
					SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
					Date iDate;
					try {
						iDate = sf.parse(date);
						Inventory inventory =new Inventory(inventoryId, storageId, iName, iNumber, iType, iSpecification, iDate, remark, pId, transactor);
						list.add(inventory);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close_ResultSet(resultSet);
			}
		}
		return list;
	}

	@Override
	public Inventory queryInventory(int inventoryId) {
		String inventorySql = "SELECT * FROM inventory WHERE inventoryId = ?";
		Object [] objects = {inventoryId};
		Inventory inventory = null;
		ResultSet resultSet = execute_Query(inventorySql, objects);
		try {
			if (resultSet.next()) {
				int storageId = resultSet.getInt("storageId");
				String iName = resultSet.getString("iName");
				String iNumber = resultSet.getString("iNumber");
				String iType = resultSet.getString("iType");
				String iSpecification = resultSet.getString("iSpecification");
				Date iDate = (Date) resultSet.getObject("iDate");
				String pId = resultSet.getString("pId");
				String remark = resultSet.getString("remark");
				String transactor = resultSet.getString("transactor");
				inventory = new Inventory(0, storageId, iName, iNumber, iType, iSpecification, iDate, remark, pId, transactor);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close_ResultSet(resultSet);
		}
		return inventory;
	}

	@Override
	public boolean updateInventoryById(Inventory inventory) {
		String inventorySql = "UPDATE inventory SET iName = ?,iNumber = ?,iType = ?,iSpecification = ?";
		String iName = inventory.getiName();
		String iNumber = inventory.getiNumber();
		String iType = inventory.getiType();
		String iSpecification = inventory.getiSpecification();
		Object [] objects = {iName,iNumber,iType,iSpecification};
		boolean b = execute_Insert_Update_Delete(inventorySql, objects);
		return b;
	}

	@Override
	public boolean deleteInventoryById(int inventoryId) {
		String inventorySql = "DELETE FROM inventory WHERE inventoryId = ?";
		Object [] objects = {inventoryId};
		boolean b = execute_Insert_Update_Delete(inventorySql, objects);
		return b;
	}

}
