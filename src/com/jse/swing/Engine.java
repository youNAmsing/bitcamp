package com.jse.swing;

import java.util.Scanner;

//외부에서 값을 입력받아서 실행시키는 거
public class Engine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		GradeService gradeService = new GradeService();
//		GradeBean[] grades = new GradeBean[3]; // 오버로딩으로 바꾸기 위해, 값을 저장하기 위해 배열 시작
//		상위 메서드를 선언했다면 하위 메서드를 굳이 선언할 필요는 없다
//		MemberBean[] joins = new MemberBean[3];   회원가입

		System.out.println(":::재밌는 시스템:::");
		while (true) {
			System.out.println("[0]종료 [1]성적표  [2]성적표출력  [3]학과순위 [4]회원가입");
			switch (sc.nextInt()) {
			case 0:
				System.out.println("시스템이 종료됩니다...");
				return;
				
				
			case 1:
				for (int i = 0; i < 3; i++) { //i : 횟수
					System.out.println(":::성적표:::");
					System.out.println("이름, 국어, 영어, 수학 점수를 입력해주세요.");
					gradeService.add(
							new GradeBean(
									sc.next(),
									sc.nextInt(),
									sc.nextInt(),
									sc.nextInt()));
				} // 뜻 : 그레이드i 배열이 0 ~ 1 일때 input 메소드로 이동한다
				break;
			case 2:
				GradeBean[] grades = gradeService.getGrades();
				for (int i = 0; i < 3; i++) {
					GradeBean grade = grades[i]; // 오버라이딩을 막기 위해
					// 변수 = 배열의 그레이드1, 2 값을 할당한다
					System.out.println(String.format("%s : 총점 : %d 점, 평균 : %d 점, 학점 : %s", grade.getName(),
							grade.total(), grade.average(), grade.grade()));
				}
					break;
			case 3: // 순위는 배열
				System.out.println("총점별로 1,2,3등 이름 나열하기");
				}
			}
		}
/*				int first = grades[0].total(); // 변수.메소드 불러오듯이 배열.메소드를 불러오면 된다
				int second = grades[1].total();
				int third = grades[2].total();
				int rank1 = 0;
				int rank2 = 0;
				int rank3 = 0;
				if (first > second && first > third) {
					rank1 = 1;
					rank2 = 2;
					rank3 = 3;
				} else if (first > third && third > second) {
					rank1 = 1;
					rank3 = 2;
					rank2 = 3;
				} else if (second > first && first > third) {
					rank2 = 1;
					rank1 = 2;
					rank3 = 3;
				} else if (second > third && third > first) {
					rank2 = 1;
					rank3 = 2;
					rank1 = 3;
				} else if (third > first && first > second) {
					rank3 = 1;
					rank1 = 2;
					rank2 = 3;
				} else if (third > second && second > first) {
					rank3 = 1;
					rank2 = 2;
					rank1 = 3;
				} else {
					System.out.println("잘못 입력된 값입니다.");
				}
				System.out.println(String.format(grades[0].getName() + " : " + rank1 + " , " + grades[1].getName()
						+ " : " + rank2 + " , " + grades[2].getName() + " : " + rank3));
				break;
			case 4: // 멤버 3명 가입
				for (int i = 0; i < 3; ++i) {
					joins[i] = join(sc);
				}
				for (int i = 0; i < 3; ++i) {
					MemberBean member = joins[i];
					System.out.println(String.format("아이디 : %s, 비밀번호 : %s, 성함 : %s, 나이 : %d", member.getUserid(),
							member.getPassword(), member.getName(), member.getAge()));
				}
				int first1 = joins[0].getAge();
				int second1 = joins[1].getAge();
				int third1 = joins[2].getAge();
				int rank4 = 0;
				int rank5 = 0;
				int rank6 = 0;
				if (first1 > second1 && first1 > third1) {
					rank4 = 1;
					rank5 = 2;
					rank6 = 3;
				} else if (first1 > third1 && third1 > second1) {
					rank4 = 1;
					rank6 = 2;
					rank5 = 3;
				} else if (second1 > first1 && first1 > third1) {
					rank5 = 1;
					rank4 = 2;
					rank6 = 3;
				} else if (second1 > third1 && third1 > first1) {
					rank5 = 1;
					rank6 = 2;
					rank4 = 3;
				} else if (third1 > first1 && first1 > second1) {
					rank6 = 1;
					rank4 = 2;
					rank5 = 3;
				} else if (third1 > second1 && second1 > first1) {
					rank6 = 1;
					rank5 = 2;
					rank4 = 3;
				} else {
					System.out.println("잘못 입력된 값입니다.");
				}
				System.out.println("나이순위 - " + joins[0].getName() + " : " + rank4 + ", " + joins[1].getName() + " : "
						+ rank5 + ", " + joins[2].getName() + " : " + rank6);
				break;
			}
		}
	} // 레퍼런스가 같으면 "오버라이딩" 발생!!!!(두번째 학생의 성적이 첫번째 학생의 성적을 덮어씀) --> 클라이언트 요청에 따라
		// "오버로딩"으로 변경해야 함--> 배열 탄생
		// 배열

	// 멤버들을 나이순으로
*/
	static MemberBean join(Scanner sc) {
		MemberBean join = new MemberBean();
		System.out.println(":::회원가입:::");
		System.out.println("아이디를 입력해주세요.");
		join.setUserid(sc.next());
		System.out.println("비밀번호를 입력해주세요.");
		join.setPassword(sc.next());
		System.out.println("성함을 입력해주세요.");
		join.setName(sc.next());
		System.out.println("나이를 입력해주세요.");
		join.setAge(sc.nextInt());
		return join;
	}

	static GradeBean input(Scanner sc) { // 파라미터, n번 이상 돌리기 위해서 생성
		// 인스턴스타입도 리턴값이 될 수 있다
		System.out.println("이름, 국어, 영어, 수학 점수를 입력해주세요.");
		return new GradeBean(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
	/*
	 * grade.setName(sc.next()); System.out.println("국어 점수를 입력해주세요.");
	 * grade.setKorean(sc.nextInt()); System.out.println("영어 점수를 입력해주세요.");
	 * grade.setEnglish(sc.nextInt()); System.out.println("수학 점수를 입력해주세요.");
	 * grade.setMath(sc.nextInt());
	 * 
	 * return grade; }
	 */
}
