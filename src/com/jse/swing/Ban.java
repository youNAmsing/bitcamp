package com.jse.swing;

// grade의 집합체(상위개념)이야.
public class Ban {
	private GradeBean[] grades;

	public Ban() {
		grades = new GradeBean[100]; // 타입(Member[])이 있으니 "초기화" -> 필드에서는 초기화하면 안 됨.. 에어리어에서만.
	}

	public void setGrades() {
		this.grades = grades; // assign이 있을 때 초기화가 진행되므로 초기화는 에어리어에서.
	}

	public GradeBean[] getGrades() {
		for (int i = 0; i < 3; i++) {
			GradeBean grade = grades[i]; // 오버라이딩을 막기 위해
			// 변수 = 배열의 그레이드1, 2 값을 할당한다
			System.out.println(String.format("%s : 총점 : %d 점, 평균 : %d 점, 학점 : %s", grade.getName(), grade.total(),
					grade.average(), grade.grade()));
			return grades;
		}
	}
}
