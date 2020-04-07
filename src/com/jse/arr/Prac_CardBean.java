package com.jse.arr;
//단일개체 : 하나 받기!
public class Prac_CardBean {
	private String kind;
	private int number;

	public Prac_CardBean(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
}
