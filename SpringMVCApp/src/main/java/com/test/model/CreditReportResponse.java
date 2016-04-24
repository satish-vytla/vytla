package com.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditReportResponse {
	private int score;
	private int noOfAccounts;
	private String ssn;
	private String fname;
	private String dob;
	public int getScore() {
		return score;
	}
	public CreditReportResponse() {
		super();
	}
	public CreditReportResponse(int score, int noOfAccounts, String ssn,
			String fname, String dob) {
		super();
		this.score = score;
		this.noOfAccounts = noOfAccounts;
		this.ssn = ssn;
		this.fname = fname;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "CreditReportResponse [score=" + score + ", noOfAccounts="
				+ noOfAccounts + ", ssn=" + ssn + ", fname=" + fname + ", dob="
				+ dob + "]";
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNoOfAccounts() {
		return noOfAccounts;
	}
	public void setNoOfAccounts(int noOfAccounts) {
		this.noOfAccounts = noOfAccounts;
	}
	
}
