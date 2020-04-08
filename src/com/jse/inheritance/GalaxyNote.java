package com.jse.inheritance;

public class GalaxyNote extends Iphone {

	private String bigsize;
	
	public GalaxyNote(String phonenumber, String name, String company, boolean portable, String search, String bigsize) {
		super(phonenumber, name, company, portable, search);
		// TODO Auto-generated constructor stub
		this.bigsize = bigsize;
	}

	public String getBigsize() {
		return bigsize;
	}

	public void setBigsize(String bigsize) {
		this.bigsize = bigsize;
	}
}
