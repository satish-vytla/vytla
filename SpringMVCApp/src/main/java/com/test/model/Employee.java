package com.test.model;

public class Employee {

	private Integer eno;
	private String ename;
	private Integer salary;
	private String ssn;

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee(Integer eno, String ename, Integer salary, String ssn) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary="
				+ salary + ", ssn=" + ssn + "]";
	}

	public Employee() {
		super();
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
