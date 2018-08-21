package com.mybatis.poc;

import java.math.BigDecimal;

public class Student {

	private BigDecimal id;
	private String name;
	private String branch;
	private BigDecimal percentage;
	private BigDecimal phone;
	private String email;

	
	public Student() {
		super();
	}

	public Student(BigDecimal id, String name, String branch, BigDecimal percentage, BigDecimal phone, String email) {
		super();
		this.id=id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
		this.phone = phone;
		this.email = email;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public BigDecimal getPhone() {
		return phone;
	}

	public void setPhone(BigDecimal phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Student [id=");
		stringBuilder.append(id);
		stringBuilder.append(", name=");
		stringBuilder.append(name);
		stringBuilder.append(", branch=");
		stringBuilder.append(branch);
		stringBuilder.append(", percentage=");
		stringBuilder.append(percentage);
		stringBuilder.append(", phone=");
		stringBuilder.append(phone);
		stringBuilder.append(", email=");
		stringBuilder.append(email);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
