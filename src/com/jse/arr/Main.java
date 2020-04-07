package com.jse.arr;

import java.util.Scanner;

//엔진 만들기
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CardService service = new CardService(); // 카드서비스 카드빈 생성자에는 이미 배열 3개가 만들어져 있따

		while (true) {
			System.out.println(":::시스템:::");
			System.out.println("[0]종료 [1]카드 3장 받기 [2]카드 출력");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return;
			case 1:
				System.out.println("카드 3장 받기");
				System.out.println("카드 모양, 숫자를 차례대로 입력해주세요.");
				/*
				 * CardBean card = new CardBean(sc.next(), sc.nextInt()); service.add(card);
				 * CardBean card = new CardBean(sc.next(), sc.nextInt()); service.add(card);
				 * CardBean card = new CardBean(sc.next(), sc.nextInt()); service.add(card); 조건에
				 * 조건 실행 for
				 */
				for (int i = 0; i < 3; ++i) {
					service.add(new CardBean(sc.next(), sc.nextInt()));
					// 변수 card를 new~로 대체시킨 것
				}

				break;
			case 2:
				System.out.println("카드 출력");
				CardBean[] cards = service.getCards();
				for (int i = 0; i < 3; ++i) { // for과 array는 뗄레야 뗼 수 없는 사이~
					System.out.println(String.format("카드 모양 : %s, 카드 넘버 : %d", cards[i].getKind(), cards[i].getNumber()));
				}
				break;
			}
		}

	}

}