package com.jse.inheritance;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(":::시스템:::");
			System.out.println("메뉴를 선택해주십시오.");
			System.out.println("[0]종료 [1]");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("시스템이 종료됩니다..");
				return;
			case 1:
				
				break;

			}
		}
	}
}
