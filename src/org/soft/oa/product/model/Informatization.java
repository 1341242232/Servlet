package org.soft.oa.product.model;

//产品基础信息表
public class Informatization {

	private int informatizationId;
	private String iName;
	private String iType;
	private String inEcification;
	private String pId;
	private int particularsId;
	public Informatization() {
	
	}
	
	public Informatization(int informatizationId, String iName, String iType, String inEcification, String pId,
			int particularsId) {
		
		this.informatizationId = informatizationId;
		this.iName = iName;
		this.iType = iType;
		this.inEcification = inEcification;
		this.pId = pId;
		this.particularsId = particularsId;
	}

	public int getInformatizationId() {
		return informatizationId;
	}
	public void setInformatizationId(int informatizationId) {
		this.informatizationId = informatizationId;
	}
	public String getiName() {
		return iName;
	}
	public void setiName(String iName) {
		this.iName = iName;
	}
	public String getiType() {
		return iType;
	}
	public void setiType(String iType) {
		this.iType = iType;
	}
	public String getInEcification() {
		return inEcification;
	}
	public void setInEcification(String inEcification) {
		this.inEcification = inEcification;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}

	public int getParticularsId() {
		return particularsId;
	}

	public void setParticularsId(int particularsId) {
		this.particularsId = particularsId;
	}
	
	
}
