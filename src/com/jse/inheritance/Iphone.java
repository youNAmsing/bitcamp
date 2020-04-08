package com.jse.inheritance;

public class Iphone extends CellPhone {

	private String search; // 검색기능

	public Iphone(String phonenumber, String name, String company, boolean portable, String search) {
		super(phonenumber, name, company, portable);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
