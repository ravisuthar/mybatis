package com.xStream.poc;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("PhoneNumber")
public class PhoneNumber {

	private int code;
	private String number;

	
	public PhoneNumber(int code, String number) {
		super();
		this.code = code;
		this.number = number;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("PhoneNumber [code=");
		stringBuilder.append(code);
		stringBuilder.append(", number=");
		stringBuilder.append(number);
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
