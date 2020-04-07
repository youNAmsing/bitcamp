package com.jse.arr;

//가장 작은 차원
public class CardBean {
	private String kind;
	private int number;

	public CardBean(String kind, int number) {
		this.kind = kind;
		this.number = number;
	} //set 하나하나 입력하는 것을 한 번에 하기 위함

	public void setKind(int card) {
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
