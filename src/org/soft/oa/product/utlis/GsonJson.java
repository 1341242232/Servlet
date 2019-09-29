package org.soft.oa.product.utlis;

import java.util.Date;

public class GsonJson {
	private int inventoryId;
	private String op;
	private int storageId;
	private String iName;
	private String iNumber;
	private String iType;
	private String iSpecification;
	private String iDate;
	private String remark;
	private String pId;
	private String transactor;
	
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getStorageId() {
		return storageId;
	}
	public void setStorageId(int storageId) {
		this.storageId = storageId;
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
	
	public String getiDate() {
		return iDate;
	}
	public void setiDate(String iDate) {
		this.iDate = iDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getTransactor() {
		return transactor;
	}
	public void setTransactor(String transactor) {
		this.transactor = transactor;
	}
	@Override
	public String toString() {
		return "GsonJson [inventoryId=" + inventoryId + ", op=" + op + ", storageId=" + storageId + ", iName=" + iName
				+ ", iNumber=" + iNumber + ", iType=" + iType + ", iSpecification=" + iSpecification + ", iDate="
				+ iDate + ", remark=" + remark + ", pId=" + pId + ", transactor=" + transactor + "]";
	}
	
	
	
}
