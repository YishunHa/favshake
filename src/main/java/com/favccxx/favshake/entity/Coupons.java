package com.favccxx.favshake.entity;

import java.util.Date;

public class Coupons {
	/**�Ż�ȯId*/
	private String couponsId;
	/**�Ż�ȯ���ŷ�ʽ*/
	private String couponsType;
	/**�Ż�ȯ���ù���*/
	private String couponsRule;
	/**�Ż�ȯ����*/
	private String couponsName;
	/**�Ż�ȯ���*/
	private String couponsValue;
	/**�Ż�ȯ�����*/
	private int couponsRandom;
	/**�Ż�ȯ��ȡ����*/
	private String couponsURL;
	/**�Ż�ȯʹ�õ���*/
	private String couponsArea;
	/**��������*/
	private Date expiredDate;
	/**0:�����ã�1������*/
	private int couponsStatus;

	private Date createDate;
	
	private String createUserName;
	
	private String createUserEmail;

	public String getCouponsId() {
		return couponsId;
	}

	public void setCouponsId(String couponsId) {
		this.couponsId = couponsId;
	}

	public String getCouponsType() {
		return couponsType;
	}

	public void setCouponsType(String couponsType) {
		this.couponsType = couponsType;
	}

	public String getCouponsRule() {
		return couponsRule;
	}

	public void setCouponsRule(String couponsRule) {
		this.couponsRule = couponsRule;
	}

	public String getCouponsName() {
		return couponsName;
	}

	public void setCouponsName(String couponsName) {
		this.couponsName = couponsName;
	}

	public String getCouponsValue() {
		return couponsValue;
	}

	public void setCouponsValue(String couponsValue) {
		this.couponsValue = couponsValue;
	}

	public String getCouponsURL() {
		return couponsURL;
	}

	public void setCouponsURL(String couponsURL) {
		this.couponsURL = couponsURL;
	}

	public String getCouponsArea() {
		return couponsArea;
	}

	public void setCouponsArea(String couponsArea) {
		this.couponsArea = couponsArea;
	}

	public Date getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public int getCouponsStatus() {
		return couponsStatus;
	}

	public void setCouponsStatus(int couponsStatus) {
		this.couponsStatus = couponsStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getCouponsRandom() {
		return couponsRandom;
	}

	public void setCouponsRandom(int couponsRandom) {
		this.couponsRandom = couponsRandom;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserEmail() {
		return createUserEmail;
	}

	public void setCreateUserEmail(String createUserEmail) {
		this.createUserEmail = createUserEmail;
	}
	
	
}
