package com.favccxx.favshake.entity;

public class RedEnvelop {
	
	public RedEnvelop(){
		
	}
	
	public RedEnvelop(String redEnvelopType){
		this.redEnvelopType = redEnvelopType;
		if("1".equals(redEnvelopType)){
			this.redEnvelopURL = "http://123.57.155.30/favshake/initReceiveCash";
			this.redEnvelopName = "";			
		}
		
	}
	
	private String redEnvelopId;

	/**
	 * �������
	 */
	private String redEnvelopName;
	/**
	 * ���ֵ
	 */
	private String redEnvelopValue;
	/**�������*/
	private String redEnvelopType;
	/**�������*/
	private String redEnvelopURL;
	
	
	public String getRedEnvelopId() {
		return redEnvelopId;
	}

	public void setRedEnvelopId(String redEnvelopId) {
		this.redEnvelopId = redEnvelopId;
	}

	public String getRedEnvelopName() {
		return redEnvelopName;
	}
	public void setRedEnvelopName(String redEnvelopName) {
		this.redEnvelopName = redEnvelopName;
	}
	public String getRedEnvelopValue() {
		return redEnvelopValue;
	}
	public void setRedEnvelopValue(String redEnvelopValue) {
		this.redEnvelopValue = redEnvelopValue;
	}
	public String getRedEnvelopType() {
		return redEnvelopType;
	}
	public void setRedEnvelopType(String redEnvelopType) {
		this.redEnvelopType = redEnvelopType;
	}
	public String getRedEnvelopURL() {
		return redEnvelopURL;
	}
	public void setRedEnvelopURL(String redEnvelopURL) {
		this.redEnvelopURL = redEnvelopURL;
	}
	
	
}
