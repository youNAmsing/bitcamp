package com.jse.swing;

import java.util.Scanner;

//외부에서 값을 입력받아서 실행시키는 거
public class Engine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Grade[] grades = new Grade[2]; // 오버로딩으로 바꾸기 위해, 값을 저장하기 위해 배열 시작

		System.out.println(":::재밌는 시스템:::");
		while (true) {
			System.out.println("[0]종료 [1]성적표  [2]성적표출력  [3]");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return;
			case 1:
				System.out.println(":::성적표:::");
				// 학생 수가 많아질 때, 리팩토링
				for (int i = 0; i < 2; i++) {
					grades[i] = input(sc); // method call! 위의 grade와 아래의 grade는 다름(배열)
				}   //뜻 : 그레이드i 배열이 0 ~ 1 일때 input 메소드로 이동한다
				break;
			case 2:
				for (int i = 0; i < 2; i++) {
					Grade grade = grades[i]; // 오버라이딩을 막기 위해
					// 변수  = 배열의 그레이드1, 2 값을 할당한다
					System.out.println(String.format("%s : 총점 : %d 점, 평균 : %d 점, 학점 : %s", grade.getName(),
							grade.total(), grade.average(), grade.grade()));
				}
				break;
			}
		}
	} // 레퍼런스가 같으면 "오버라이딩" 발생!!!!(두번째 학생의 성적이 첫번째 학생의 성적을 덮어씀) --> 클라이언트 요청에 따라
		// "오버로딩"으로 변경해야 함--> 배열 탄생
		// 배열

	static Grade input(Scanner sc) { // 파라미터, n번 이상 돌리기 위해서 생성
		// 인스턴스타입도 리턴값이 될 수 있다
		Grade grade = new Grade();
		System.out.println("성함을 입력해주세요.");
		grade.setName(sc.next());
		System.out.println("국어 점수를 입력해주세요.");
		grade.setKorean(sc.nextInt());
		System.out.println("수학 점수를 입력해주세요.");
		grade.setMath(sc.nextInt());
		System.out.println("영어 점수를 입력해주세요.");
		grade.setEnglish(sc.nextInt());
		return grade;
	}
}
