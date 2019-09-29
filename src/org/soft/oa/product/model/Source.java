package org.soft.oa.product.model;

//供应商信息表
public class Source {

	private int sourceId;
	private String supplierName;
	private String supplierSite;
	private String supplierPhone;
	private String supplierRemark;
	public Source() {
		
	}
	public Source(int sourceId, String supplierName, String supplierSite, String supplierPhone, String supplierRemark) {
		
		this.sourceId = sourceId;
		this.supplierName = supplierName;
		this.supplierSite = supplierSite;
		this.supplierPhone = supplierPhone;
		this.supplierRemark = supplierRemark;
	}
	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierSite() {
		return supplierSite;
	}
	public void setSupplierSite(String supplierSite) {
		this.supplierSite = supplierSite;
	}
	public String getSupplierPhone() {
		return supplierPhone;
	}
	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}
	public String getSupplierRemark() {
		return supplierRemark;
	}
	public void setSupplierRemark(String supplierRemark) {
		this.supplierRemark = supplierRemark;
	}
	
	
}
