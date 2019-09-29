package org.soft.oa.product.model;

import java.sql.Date;

//出库信息记录表
public class Take {

	private int takeId;
	private String tName;
	private String tNumber;
	private String tType;
	private String tSpecification;
	private Date tDate;
	private String tremark;
	private String pId;
	private int inventoryId;
	private int administratorId;
	public Take() {
		
	}
	
	public Take(int takeId, String tName, String tNumber, String tType, String tSpecification, Date tDate,
			String tremark, String pId, int inventoryId, int administratorId) {
		
		this.takeId = takeId;
		this.tName = tName;
		this.tNumber = tNumber;
		this.tType = tType;
		this.tSpecification = tSpecification;
		this.tDate = tDate;
		this.tremark = tremark;
		this.pId = pId;
		this.inventoryId = inventoryId;
		this.administratorId = administratorId;
	}

	public int getTakeId() {
		return takeId;
	}
	public void setTakeId(int takeId) {
		this.takeId = takeId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String gettNumber() {
		return tNumber;
	}
	public void settNumber(String tNumber) {
		this.tNumber = tNumber;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public String gettSpecification() {
		return tSpecification;
	}
	public void settSpecification(String tSpecification) {
		this.tSpecification = tSpecification;
	}
	public Date gettDate() {
		return tDate;
	}
	public void settDate(Date tDate) {
		this.tDate = tDate;
	}
	public String getTremark() {
		return tremark;
	}
	public void setTremark(String tremark) {
		this.tremark = tremark;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public int getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}
	
	
}
