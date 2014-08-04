package com.user.bean;

import java.sql.Date;

public class RegisterData {
	private String mName;
	private String mGender;
	private Date mDob;
	private String mFatherName;
	private String mMotherName;
	private String mNationality;
	private String mMailId;
	private String mEmailId;
	private String mMaritalStatus;
	private String mFatherJob;
	private String mMotherJob;
	private long mLandlineNumber;

	public String getName() {
		return mName;
	}

	public void setName(String pName) {
		mName = pName;
	}

	public String getGender() {
		return mGender;
	}

	public void setGender(String pGender) {
		mGender = pGender;
	}

	public Date getDob() {
		return mDob;
	}

	public void setDob(Date pDob) {
		mDob = pDob;
	}

	public String getFatherName() {
		return mFatherName;
	}

	public void setFatherName(String pFatherName) {
		mFatherName = pFatherName;
	}

	public String getMotherName() {
		return mMotherName;
	}

	public void setMotherName(String pMotherName) {
		mMotherName = pMotherName;
	}

	public String getNationality() {
		return mNationality;
	}

	public void setNationality(String pNationality) {
		mNationality = pNationality;
	}

	public String getMailId() {
		return mMailId;
	}

	public void setMailId(String pMailId) {
		mMailId = pMailId;
	}

	public String getEmailId() {
		return mEmailId;
	}

	public void setEmailId(String pEmailId) {
		mEmailId = pEmailId;
	}

	public String getMaritalStatus() {
		return mMaritalStatus;
	}

	public void setMaritalStatus(String pMaritalStatus) {
		mMaritalStatus = pMaritalStatus;
	}

	public String getFatherJob() {
		return mFatherJob;
	}

	public void setFatherJob(String pFatherJob) {
		mFatherJob = pFatherJob;
	}

	public String getMotherJob() {
		return mMotherJob;
	}

	public void setMotherJob(String pMotherJob) {
		mMotherJob = pMotherJob;
	}

	public long getLandlineNumber() {
		return mLandlineNumber;
	}

	public void setLandlineNumber(long pLandlineNumber) {
		mLandlineNumber = pLandlineNumber;
	}

}
