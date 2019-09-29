package org.soft.oa.product.model;

//管理员信息表
public class Administrator {
	private int administratorId;
	private String adName;
	private String  adAge;
	private String adSex;
	private String aPhone; 
	private String adDate;
	private int storageId;
	public Administrator() {
	
	}
	
	public Administrator(int administratorId, String adName, String adAge, String adSex, String aPhone, String adDate,
			int storageId) {
		super();
		this.administratorId = administratorId;
		this.adName = adName;
		this.adAge = adAge;
		this.adSex = adSex;
		this.aPhone = aPhone;
		this.adDate = adDate;
		this.storageId = storageId;
	}

	public int getAdministratorId() {
		return administratorId;
	}
	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdAge() {
		return adAge;
	}
	public void setAdAge(String adAge) {
		this.adAge = adAge;
	}
	public String getAdSex() {
		return adSex;
	}
	public void setAdSex(String adSex) {
		this.adSex = adSex;
	}
	public String getaPhone() {
		return aPhone;
	}
	public void setaPhone(String aPhone) {
		this.aPhone = aPhone;
	}
	public String getAdDate() {
		return adDate;
	}
	public void setAdDate(String adDate) {
		this.adDate = adDate;
	}

	public int getStorageId() {
		return storageId;
	}

	public void setStorageId(int storageId) {
		this.storageId = storageId;
	}
	
	
}
