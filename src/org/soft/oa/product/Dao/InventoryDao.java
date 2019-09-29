package org.soft.oa.product.Dao;

import java.util.List;

import org.soft.oa.product.model.Inventory;

public interface InventoryDao {

	//新增产品入库
	public boolean addProduct(Inventory inventory);
	
	//查询所有产品库存信息
	public List<Inventory> queryInventoryList();
	
	//查询单个产品的库存信息
	public Inventory queryInventory(int inventoryId);
	
	//修改单个产品的库存信息
	public boolean updateInventoryById(Inventory inventory);
	
	//删除单个产品的库存信息
	public boolean deleteInventoryById(int inventoryId);
	
	//批量删除产品的库存信息
	
	
}
