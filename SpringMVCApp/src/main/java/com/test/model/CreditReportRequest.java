package com.test.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditReportRequest {
	
	private String ssn;
	private String fname;
	private String dob;
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
	public CreditReportRequest(String ssn, String fname, String dob) {
		super();
		this.ssn = ssn;
		this.fname = fname;
		this.dob = dob;
	}
	public CreditReportRequest() {
		super();
	}
	@Override
	public String toString() {
		return "CreditReportRequest [ssn=" + ssn + ", fname=" + fname
				+ ", dob=" + dob + "]";
	}
	

}
