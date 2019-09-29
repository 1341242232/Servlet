package org.soft.oa.product.model;

import java.sql.Date;


//产品入库信息记录表
public class Deposit {

	private int depositId;
	private String dName;
	private int dNumber;
	private String dType;
	private String dSpecification;
	private Date dDate;
	private String pId;
	private String dremark;
	private int informatizationId;
	private int administratorId;
	public Deposit() {
	
	}
	
	public Deposit(int depositId, String dName, int dNumber, String dType, String dSpecification, Date dDate,
			String pId, String dremark, int informatizationId, int administratorId) {
		super();
		this.depositId = depositId;
		this.dName = dName;
		this.dNumber = dNumber;
		this.dType = dType;
		this.dSpecification = dSpecification;
		this.dDate = dDate;
		this.pId = pId;
		this.dremark = dremark;
		this.informatizationId = informatizationId;
		this.administratorId = administratorId;
	}

	public int getDepositId() {
		return depositId;
	}
	public void setDepositId(int depositId) {
		this.depositId = depositId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getdNumber() {
		return dNumber;
	}
	public void setdNumber(int dNumber) {
		this.dNumber = dNumber;
	}
	public String getdType() {
		return dType;
	}
	public void setdType(String dType) {
		this.dType = dType;
	}
	public String getdSpecification() {
		return dSpecification;
	}
	public void setdSpecification(String dSpecification) {
		this.dSpecification = dSpecification;
	}
	public Date getdDate() {
		return dDate;
	}
	public void setdDate(Date dDate) {
		this.dDate = dDate;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getDremark() {
		return dremark;
	}
	public void setDremark(String dremark) {
		this.dremark = dremark;
	}

	public int getInformatizationId() {
		return informatizationId;
	}

	public void setInformatizationId(int informatizationId) {
		this.informatizationId = informatizationId;
	}

	public int getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}
	
	
}
