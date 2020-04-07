/*package com.jse.app;

import java.util.Random;

public class Dice2 {
	private String answer;
	private int com;

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}
	
	public void setCom(int com) {
		this.com = cpm;
	}

	public int getCom() {
		return com;
	}

	public void calculate() {
		
		this.com = com;
		switch (dice) {
		case 1:
			com = "홀";
			break;
		case 2:
			com = "짝";
			break;
		case 3:
			com = "홀";
			break;
		case 4:
			com = "짝";
			break;
		case 5:
			com = "홀";
			break;
		case 6:
			com = "짝";
			break;
		String result = "";
		if (answer.equals(com)) {
			result = "맞음";
		} else {
			result = "틀림";
		}
		return result;
	}
}
	/*
	 * if(dice%2 == 0) { System.out.println("짝수입니다!"); }else {
	 * System.out.println("홀수입니다!"); }
	 */

	/*
	 * statement와 expression만 존재하는 부분 : 알고리즘 이라고 한다
	 * System.out.println(":::주사위 홀짝 맞추기 게임:::");
	 * System.out.println("기대하는 값(홀/짝)을 입력해주세요"); Scanner sc = new
	 * Scanner(System.in); String a = sc.next(); System.out.println("사용자 선택값 : "+a);
	 * Random rd = new Random(); int b = rd.nextInt(6)+1;
	 * System.out.println("컴퓨터 출력값 : "+b); String result = ""; if(b == 1) {
	 * System.out.println("컴퓨터 홀짝 결과 : 홀"); }else if(b == 2) {
	 * System.out.println("컴퓨터 홀짝 결과 : 짝"); } if(b == 3) {
	 * System.out.println("컴퓨터 홀짝 결과 : 홀"); }else if(b == 4) {
	 * System.out.println("컴퓨터 홀짝 결과 : 짝"); } if(b == 5) {
	 * System.out.println("컴퓨터 홀짝 결과 : 홀"); }else {
	 * System.out.println("컴퓨터 홀짝 결과 : 짝"); } if(a.equals(result)) {//object type의
	 * operation은 method로 처리한다 System.out.println("맞음"); }else{
	 * System.out.println("틀림"); }
	 */
/*
	static void dice() {
		System.out.println(":::주사위 홀짝 맞추기 게임:::");
		System.out.println("기대하는 값(홀/짝)을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(String.format("사용자 선택값 : %s ", a));
		Random rd = new Random();
		int b = rd.nextInt(6) + 1;
		System.out.println("컴퓨터 출력값 : %d" + b);
		String result = "";
		if (b == 1) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
		} else if (b == 2) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if (b == 3) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
		} else if (b == 4) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if (b == 5) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
		} else {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if (a.equals(result)) {// object type의 operation은 method로 처리한다
			System.out.println("맞음");
		} else {
			System.out.println("틀림");
		}

	}
}
*/