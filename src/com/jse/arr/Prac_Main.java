package com.jse.arr;

import java.util.Scanner;

// 카드 모양과 숫자를 5장을 입력하면 출력하는 시스템 만들어주세염.
public class Prac_Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Prac_CardService cards = new Prac_CardService();

		while (true) {
			System.out.println(":::시스템:::");
			System.out.println("시스템 메뉴를 선택해주세요~");
			System.out.println("[0]종료 [1]카드 5장 받기 [2]카드 출력");
			int flag = sc.nextInt();
			switch (flag) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return;
			case 1:
				System.out.println("카드 5장 받기");
				System.out.println("카드의 '모양'과 '숫자'를 5번 차례대로 입력해주세요 :)");
				for (int i = 0; i < 5; ++i) {
					cards.add(new CardBean(sc.next(), sc.nextInt()));
				}

				break;
			case 2:
				System.out.println("카드 출력");
				CardBean[] card = cards.getCards();
				for(int i=0; i<5; ++i) {
				System.out.println(String.format("카드 모양 : %s , 카드 숫자 : %d ", card[i].getKind(), card[i].getNumber()));
				}
				break;
			}
		}

	}
}
