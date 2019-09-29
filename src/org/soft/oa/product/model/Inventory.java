package org.soft.oa.product.model;

import java.util.Date;

public class Inventory {

	private int inventoryId;
	private int storageId;
	private String iName;
	private String iNumber;
	private String iType;
	private String iSpecification;
	private Date iDate;
	private String remark;
	private String pId;
	private String transactor;
	
	public Inventory() {
		
	}
	
	
	
	

	

	public Inventory(int inventoryId, int storageId, String iName, String iNumber, String iType, String iSpecification,
			Date iDate, String remark, String pId, String transactor) {
		super();
		this.inventoryId = inventoryId;
		this.storageId = storageId;
		this.iName = iName;
		this.iNumber = iNumber;
		this.iType = iType;
		this.iSpecification = iSpecification;
		this.iDate = iDate;
		this.remark = remark;
		this.pId = pId;
		this.transactor = transactor;
	}

	public int getStorageId() {
		return storageId;
	}

	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}

	public Date getiDate() {
		return iDate;
	}

	public void setiDate(Date iDate) {
		this.iDate = iDate;
	}

	public String getTransactor() {
		return transactor;
	}

	public void setTransactor(String transactor) {
		this.transactor = transactor;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiNumber() {
		return iNumber;
	}
	public void setiNumber(String iNumber) {
		this.iNumber = iNumber;
	}
	public String getiType() {
		return iType;
	}
	public void setiType(String iType) {
		this.iType = iType;
	}
	public String getiSpecification() {
		return iSpecification;
	}
	public void setiSpecification(String iSpecification) {
		this.iSpecification = iSpecification;
	}
	public String iSpecification() {
		return pId;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	
}
