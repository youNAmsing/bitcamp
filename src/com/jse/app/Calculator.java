/*
package com.jse.app;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//계산기
		System.out.println(":::계산기:::");
		//첫번재 수 입력
		System.out.println("첫 번째 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		float a = 0.3f;
		//두번째 수 입력
		System.out.println("두번째 수를 입력해주세요.");
		float b = 0.2f;
		//두 수의 합은 몇?
		System.out.println("두 수의 합은 "+(a+b)+("입니다."));
	}
}.
*/
package com.jse.app;

public class Calculator {
	private int num1;
	private int num2;
	//num3은 저장할 필요 없고 더하는 기능만 하면 된다
	//인스턴스 변수 : 값 "저장"
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1; //this 생략 가능
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2; //this 생략 가능
	}
	
	public int calCulate() {
		int num3 = num1 + num2;
		return num3;
		//num3은 저장할 필요 없고 더하는 기능만 하면 된다
	}


	
/*	
	public int cal() {
		// 계산기
		int c = this.num1+ this.num2;
		// 두 수의 합은 몇?
		return c; //리턴값이 생겼으므로 위를 int로 바꿔주어야 한다
	}
*/	
}