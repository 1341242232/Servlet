package org.soft.oa.product.model;

import java.sql.Date;

//≤÷ø‚–≈œ¢±Ì
public class Storage {

	private int storageId;
	private String storageName;
	private Date creationTime;
	private int administratorId;
	public Storage() {
		
	}
	
	public Storage(int storageId, String storageName, Date creationTime, int administratorId) {
		
		this.storageId = storageId;
		this.storageName = storageName;
		this.creationTime = creationTime;
		this.administratorId = administratorId;
	}

	public int getStorageId() {
		return storageId;
	}
	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}
	public String getStorageName() {
		return storageName;
	}
	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public int getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}
	
	
}
