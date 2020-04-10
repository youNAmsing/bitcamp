package com.jse.game;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {
		//선언 1번, 조건 5번, 행동 5번
		int sum = 0;
		for(int i = 1; i <= 5; ++i) {
			System.out.println(i);
			sum += i;
//			= overriding
//			+= overloaging
		}
		System.out.println(String.format("%d", sum));
	}

}