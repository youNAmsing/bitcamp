package com.jse.app;
//		화면
import java.util.Random;
import java.util.Scanner;
//		외부 클래스 불러오기

//		엔진은 파일당 하나만 존재(서버)
public class Engine {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
//		선언 위치의 중요성
		Member mb = new Member();
//		인스턴스 변수, instantiation
		Calculator cal = new Calculator();
		Dicenumber dice = new Dicenumber();
		RPSgame rps = new RPSgame();
		while (true) {
			System.out.println(
					"[0]종료 " + "[1]회원가입 " + "[2]로그인 " + "[3]계산기 " + "[4]주사위 홀짝 맞추기 " + "[5]가위바위보 " + "[6] ");
			int flag = sc.nextInt();
			switch (flag) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return; // 메서드 종료
			case 1:
				System.out.println(":::회원가입:::");
				System.out.println("ID를 입력해주세요.");
				String id = sc.next();
				mb.setId(id);
				break; // 일시정지

			case 2:
				System.out.println(":::로그인:::");
				System.out.println("ID를 입력해주세요.");
				String id2 = sc.next();
				String returnid = mb.getId();
				System.out.println("가입된 아이디 " + returnid);
				if (id2.equals(returnid)) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
				break;
			case 3:
				System.out.println(":::계산기:::");
				// 첫번재 수 입력
				System.out.println("첫 번째 수를 입력해주세요.");
				int a = sc.nextInt();
				cal.setNum1(a);
				// 두번째 수 입력
				System.out.println("두번째 수를 입력해주세요.");
				int b = sc.nextInt();
				cal.setNum2(b);
				int c = cal.calCulate();
				System.out.println("두 수의 합은 " + c + ("입니다."));
				break;
			case 4:
				System.out.println(":::주사위 홀짝 맞추기 게임:::");
				System.out.println("홀/짝 중 하나만 선택해주세요~");
				String expect = sc.next();
				System.out.println(String.format("사용자가 입력한 값 : %s ", expect));
				dice.setExpect(expect);
				int dicenum = rd.nextInt(6) + 1;
				System.out.println("컴퓨터 결과 : " + dicenum);
				dice.setDicenum(dicenum);
				String result = dice.switchDice();
				System.out.println(String.format("결과 : %s ", result));
				break;
			case 5:
				System.out.println(":::사용자 vs 컴퓨터 가위바위보:::");
				System.out.println("[1]가위 [2]바위 [3]보 중 하나를 숫자로 입력해주세요.");
				int userval = sc.nextInt();
				System.out.println(String.format("사용자의 선택 : %d ", userval));
				rps.setUserval(userval);
				int comval = rd.nextInt(3) + 1;
				System.out.println(String.format("컴퓨터의 선택 : %d ", comval));
				rps.setComval(comval);
				String result2 = rps.game();
				System.out.println(String.format("결과는~ %s ", result2));
				break;
			}
		}
	}
	// break에 continue를 써도 같은 현상이 일어난다. 이유가 무엇일까?
}
