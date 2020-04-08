package com.jse.inheritance;

//PhoneBean
public class Phone {

	private String phonenumber;
	private String name;
	private String company; // 회사명

	public Phone(String phonenumber, String name, String company) {
		this.phonenumber = phonenumber;
		this.name = name;
		this.company = company;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

}
