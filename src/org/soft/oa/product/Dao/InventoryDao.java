package org.soft.oa.product.Dao;

import java.util.List;

import org.soft.oa.product.model.Inventory;

public interface InventoryDao {

	//������Ʒ���
	public boolean addProduct(Inventory inventory);
	
	//��ѯ���в�Ʒ�����Ϣ
	public List<Inventory> queryInventoryList();
	
	//��ѯ������Ʒ�Ŀ����Ϣ
	public Inventory queryInventory(int inventoryId);
	
	//�޸ĵ�����Ʒ�Ŀ����Ϣ
	public boolean updateInventoryById(Inventory inventory);
	
	//ɾ��������Ʒ�Ŀ����Ϣ
	public boolean deleteInventoryById(int inventoryId);
	
	//����ɾ����Ʒ�Ŀ����Ϣ
	
	
}
