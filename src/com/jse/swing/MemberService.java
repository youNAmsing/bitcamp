package com.jse.swing;

//요청 : 그룹은 멤버의 집합체(상위개념)이야.
public class MemberService {
	private MemberBean[] members; // 타입(Member[])이 있으니 "초기화" -> 필드에서는 초기화하면 안 됨.. 에어리어에서만.

	public MemberService() {
		members = new MemberBean[10]; // assign이 있을 때 초기화가 진행되므로 초기화는 에어리어에서.
	}
}
