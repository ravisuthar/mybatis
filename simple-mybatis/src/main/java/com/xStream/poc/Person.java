package com.xStream.poc;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("Person")
public class Person {

	@XStreamAsAttribute
	private int id;
	
	@XStreamAsAttribute
	private String name;
	
	@XStreamAsAttribute
	private double salary;
	
	@XStreamAsAttribute
	private BigDecimal investment;
	
	@XStreamAsAttribute
	private BigInteger bankSaving;
	
	@XStreamAsAttribute
	private PhoneNumber phone;
	
	
	public Person(int id, String name, double salary, BigDecimal investment, BigInteger bankSaving, PhoneNumber phone) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.investment = investment;
		this.bankSaving = bankSaving;
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public BigDecimal getInvestment() {
		return investment;
	}
	public void setInvestment(BigDecimal investment) {
		this.investment = investment;
	}
	public BigInteger getBankSaving() {
		return bankSaving;
	}
	public void setBankSaving(BigInteger bankSaving) {
		this.bankSaving = bankSaving;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Person [id=");
		stringBuilder.append(id);
		stringBuilder.append(", name=");
		stringBuilder.append(name);
		stringBuilder.append(", salary=");
		stringBuilder.append(salary);
		stringBuilder.append(", investment=");
		stringBuilder.append(investment);
		stringBuilder.append(", bankSaving=");
		stringBuilder.append(bankSaving);
		stringBuilder.append(", phone=");
		stringBuilder.append(phone);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	
	
	
}
