package com.jse.app;

import java.util.Scanner;
import java.util.Random;

public class RPSgame {
	public static void main(String[] args) {
		game();
	}

	static void game() {
		System.out.println(":::사용자 vs 컴퓨터 가위바위보:::");
		System.out.println("[1]가위 [2]바위 [3]보 중 하나를 숫자로 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		if (answer > 3) {
			System.out.println("잘못 입력하셨습니다. 게임이 종료됩니다...");
			return;
		}
		if (answer < 1) {
			System.out.println("잘못 입력하셨습니다. 게임이 종료됩니다...");
			return;
		}
		Random rd = new Random();
		int rps = rd.nextInt(3) + 1;
		String user = "";
		String com = "";
		switch (answer) {
		case 1:
			user = "가위";
			break;
		case 2:
			user = "바위";
			break;
		case 3:
			user = "보";
			break;
		}
		switch (rps) {
		case 1:
			com = "가위";
			break;
		case 2:
			com = "바위";
			break;
		case 3:
			com = "보";
			break;
		}
		System.out.println(String.format("사용자의 선택 : %s ", user));
		System.out.println(String.format("컴퓨터의 선택 : %s ", com));
		String result = "";
		if (answer == rps) {
			result = "무승부!";
		} else if (answer == 1 && rps == 2) {
			result = "패배!";
		} else if (answer == 1 && rps == 3) {
			result = "승리!";
		} else if (answer == 2 && rps == 1) {
			result = "승리!";
		} else if (answer == 2 && rps == 3) {
			result = "패배!";
		} else if (answer == 3 && rps == 1) {
			result = "패배!";
		} else {
			result = "승리!";
		}
		System.out.println(String.format("결과는~ %s ", result));
	}
}