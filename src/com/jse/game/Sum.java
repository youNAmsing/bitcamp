package com.jse.game;

public class Sum {
	public static void main(String[] args) {
		game();
	}

	static void game() {
		int sum = 0;
		for(int i=1; i<=100; ++i) {
		sum += i;
		}
		System.out.println(String.format("1부터 100까지의 합은~ %d ", sum));
	}

}