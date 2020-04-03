package com.jse.swing;

import java.util.Scanner;

//외부에서 값을 입력받아서 실행시키는 거
public class Engine {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Grade grade = null; //잊지 말것
		
		System.out.println(":::재밌는 시스템:::");
		while (true) {
			System.out.println("[0]종료 [1]학점  [2]  [3]");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return;
			case 1:
				grade = new Grade();
				System.out.println(":::학점계산기:::");
				System.out.println("성함을 입력해주세요.");
				grade.setName(sc.next());
				System.out.println("국어 점수를 입력해주세요.");
				grade.setKorean(sc.nextInt());
				System.out.println("수학 점수를 입력해주세요.");
				grade.setMath(sc.nextInt());
				System.out.println("영어 점수를 입력해주세요.");
				grade.setEnglish(sc.nextInt());
				System.out.println(String.format("%s : 총점 : %d 점, 평균 : %d 점, 학점 : %s",grade.getName(), grade.total(), grade.average(), grade.grade()));
				break;
			case 2:
				break;
			case 4:
				break;

			}
		}
	}
}
