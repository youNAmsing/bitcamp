package com.jse.inheritance;

public class CellPhone extends Phone {
	public CellPhone(String phonenumber, String name, String company, boolean portable) { // 만들어줌
		// super가 받을 값 : 저장공간 공유(저장공간 phone) + 공유하지 않는건(저장공간 cellphone) 추가
		super(phonenumber, name, company);
		this.portable = portable; // 메서드니까 가져와야 함
		setPortable(portable); // setPortable로 바로 가게 하기 true니까
	}

	private boolean portable; // 빠진 것만 여기에 추가
	private String move; // 휴대 가능 여부

	public void setPortable(boolean portable) { // boolean은 변형
		this.portable = portable;
		if (portable) { // 원래 연산자 들어가지 않나? 이게 변형인가?
			this.move = "휴대 가능";
		} else {
			this.move = "휴대 불가능";
		}
	}

	public boolean isPortable() {
		return portable;
	}

	public void setMove(String move) {
		this.move = move;
	}

	public String getMove() {
		return move;
	}
}
