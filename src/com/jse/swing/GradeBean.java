package com.jse.swing;

/*
클라이언트에서 프로그램 개발 요청이 왔습니다. 
* 이름과 국,영,수 세과목점수를 입력받아서() --> 인스턴스 + 이름
* [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. --> 계산 : 총점과 평균, 출력
* 단) 평균은 소수점이하는 절삭합니다 --> type int
* 평균점수가 90점 이상 A --> 범위 if
* 80점 이상이면 B 
* 70점 이상이면 C
* 60점 이상이면 D
* 50점 이상이면 E
* 50점 미만이면 F 학점입니다라고 출력되게 해주세요
*/
public class GradeBean {
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public GradeBean(String name, int korean, int math, int english) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getKorean() {
		return korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getEnglish() {
		return english;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public int total() { //메서드 불러오는 방법 method(), 이미 세 개의 변수로 만들 수 있으므로 굳이 변수를 만들지 않아도 된다
		return korean + english + math;
	}

	public int average() { //이미 세 개의 변수로 만들 수 있으므로 굳이 변수를 만들지 않아도 된다
		return total() / 3;
	}

	public String grade() {
		String grade = "";
		int average = average();
		switch(grade) { // /10해서,,. 
		case "A":  break;

		
		}
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else if (average >= 50) {
			grade = "E";
		} else if (average < 50) {
			grade = "F";
		} else {
			System.out.println("값을 잘못 입력하셨습니다.");
		}
		return grade;
	}
}
//주말 과제 : if 를 switch로 바꿔라!!!
