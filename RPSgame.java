package com.jse.app;
import java.util.Scanner;
import java.util.Random;

public class RPSgame {
	public static void main(String[] args) {
		game();
	}
	static void game() {
		System.out.println(":::가위바위보:::");
		System.out.println("[1]가위 [2]바위 [3]보 중 하나를 숫자로 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		System.out.println(String.format("사용자 : %d ", answer)); //- 스캐너
		Random rd = new Random();
		int com = rd.nextInt(3)+1;
		System.out.println(String.format("컴퓨터 : %d ", com)); //- 컴퓨터
		if(answer == com) {
			System.out.println("무승부!");
		}else if(answer >= com) {
			System.out.println("승리!");
		}else {
			System.out.println("패배!");
		}
	}
}