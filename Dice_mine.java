package com.jse.app;

import java.util.Scanner;
import java.util.Random;

public class Dice_mine {
	public static void main(String[] args) {
		dice();
	}
	static void dice() {
		System.out.println(":::주사위 홀짝 맞추기 게임:::");
		System.out.println("홀수/짝수 중 하나를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		System.out.println(String.format("입력하신 값은 %s", answer));
		Random rd = new Random();
		int dice = rd.nextInt(6)+1;
		System.out.println(String.format("주사위 값은 %d ", dice));
		String name = "";
		switch(dice) {
		case 1 : case 3 : case 5 : name = "홀수"; break;
		case 2 : case 4 : name = "짝수"; break;
		}
		if(answer.equals(name)) {
			System.out.println("정답입니다 :)");
		}else {
			System.out.println("땡!!!! 빠잉");
		}
	}
}
//else 없애고 if만으로 돌아가게 해볼 것