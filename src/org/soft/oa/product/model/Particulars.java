package org.soft.oa.product.model;

import java.sql.Date;

//产品详情信息表
public class Particulars {

	private int particularsId;
	private String pName;
	private String pType;
	private String pEcification;
	private String pSupplierRemark;
	private Date pDate;
	private String pId;
    private int sourceId;
 	public Particulars() {
		
	}
 	
	public Particulars(int particularsId, String pName, String pType, String pEcification, String pSupplierRemark,
			Date pDate, String pId, int sourceId) {
		
		this.particularsId = particularsId;
		this.pName = pName;
		this.pType = pType;
		this.pEcification = pEcification;
		this.pSupplierRemark = pSupplierRemark;
		this.pDate = pDate;
		this.pId = pId;
		this.sourceId = sourceId;
	}

	public int getParticularsId() {
		return particularsId;
	}
	public void setParticularsId(int particularsId) {
		this.particularsId = particularsId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpType() {
		return pType;
	}
	public void setpType(String pType) {
		this.pType = pType;
	}
	public String getpEcification() {
		return pEcification;
	}
	public void setpEcification(String pEcification) {
		this.pEcification = pEcification;
	}
	public String getpSupplierRemark() {
		return pSupplierRemark;
	}
	public void setpSupplierRemark(String pSupplierRemark) {
		this.pSupplierRemark = pSupplierRemark;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	
	
}
