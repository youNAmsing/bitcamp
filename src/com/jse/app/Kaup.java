package com.jse.app;

/*
키와 몸무게를 이용하여 카우푸지수를 구하고
그 결과 정상, 저체중, 비만 등으로 몸의 사태만 말해주는 프로그램
식 = 체중 -(키)2 --> 식에 필요한 두 개를 인스터스 변수로 잡는다
결과값도 저장해야 한다면 result도 인스턴스 변수로 잡아야 한다
*/
public class Kaup {
	private double height;
	private double weight;

	public void setHeight(double height) {
		this.height = height / 100;
	}

	public double getHeight() {
		return height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight1() {
		return weight;
	}

	public String calculate() {
		double cal = weight / (height * height); // 값이 뭐 나올지 궁금하면 sout로 확인
		String result = "";
		if (cal > 0 && cal < 18) {
			result = "저체중";
		} else if (cal <= 23) { // cal >= 18 && 는 위에서 거를 것이기 때문에 빼도됌
			result = "정상";
		} else if (cal > 23) {
			result = "비만";
		} else {
			result = "잘못된 값입니다.."; // 애초부터 값을 음수로 넣는 등 장난을 칠 경우 대비
		} // 범위가 잘못 되었을 때를 방지하기 위함
		return result;
	}
}