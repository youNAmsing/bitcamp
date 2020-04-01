package com.jse.app;

import java.util.Random;
import java.util.Scanner;
//		엔진은 파일당 하나만 존재(서버)
public class Engine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		선언 위치의 중요성
		while (true) {
			System.out.println("[0]종료 [1]가위바위보 [2]주사위 홀짝 게임 [3]1to100");
			int flag = sc.nextInt();
			switch (flag) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return; // 메서드 종료
			case 1:
				RPSgame.game();
				break; // 일시정지
			case 2:
				switchDice();
				break;
			case 3:
				Sum.game();
				break;
			}
		}
	}
	//break에 continue를 써도 같은 현상이 일어난다. 이유가 무엇일까?

	static void switchDice() {
		System.out.println("홀/짝 중 하나만 선택해주세요~");
		Scanner sc = new Scanner(System.in);
		String answer = sc.next();
		System.out.println(String.format("사용자가 입력한 값 : %s ", answer));
		Random rd = new Random();
		int dice = rd.nextInt(6) + 1;
		String result = "";
		switch (dice) {
		case 1:
			result = "홀";
			break;
		case 2:
			result = "짝";
			break;
		case 3:
			result = "홀";
			break;
		case 4:
			result = "짝";
			break;
		case 5:
			result = "홀";
			break;
		case 6:
			result = "짝";
			break;
		}
		System.out.println("컴퓨터 결과 : " + result);
		String result2 = "";
		if (answer.equals(result)) {
			result2 = "딩동댕!";
		} else {
			result2 = "틀렸지롱 틀렸지롱";
		}
		System.out.println(String.format("결과 : %s ", result2));
	}
}
