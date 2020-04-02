package com.jse.app;
//서버
public class Member {
	private String id; // (동적)멤버변수, 인스턴스변수 --> reference 참조주소
	// id는 고유하니까..

	public Member() { // 생성자
		// Member() : 클래스와 이름이 같음, 메서드 구조(생성자는 메서드의 종류임)
		// constructor stub(그루터기) 이 영역에 생성자 코딩을 해~
	}

	public void setId(String id) { // (다이나믹 멤버)메서드(인스턴스 메서드) 소괄호는 파라미터존
//id : 로컬변수(메서드의 하위) - 필드에서 가져옴
		System.out.println("지역변수 들어옴 " + id);
		this.id = id; //저장한다
// 필드에 있는 변수를 인스턴스 변수로 바꾸는 것
// id : 인스턴스변수(메서드와 동급)
		System.out.println("인스턴스 변수에 저장됨 "+this.id); //저장됨
	}

//	저장된 id값을 끄집어내는 것	
	public String getId() {
		return this.id;
//	우리집에 있는 id를 가져와
		
	}
}

//set : id에게 값을 준다
//get : id에게서 값을 가져온다