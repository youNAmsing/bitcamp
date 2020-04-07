package com.jse.swing;
//grade를 통제하는 녀석
// grade의 집합체(상위개념)이야.
public class GradeService {
	private GradeBean[] grades;
	private int count;

	public GradeService() {
		grades = new GradeBean[3]; // 타입(Member[])이 있으니 "초기화" -> 필드에서는 초기화하면 안 됨.. 에어리어에서만.
		count = 0; //카운트는 0부터
	}

	public void setGrades(GradeBean[] grades) {
		this.grades = grades; // assign이 있을 때 초기화가 진행되므로 초기화는 에어리어에서.
	}

	public GradeBean[] getGrades() {
		return grades;
	}
	
	public void add(GradeBean grade) {
		grades[count] = grade;
		count++; //파라미터값이 하나씩 들어올수록 메모리 위치가 한칸씩 밀리면서 다음칸 대기 상태가 됨
	}
}
