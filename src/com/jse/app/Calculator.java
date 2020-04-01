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

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		//계산기
		System.out.println(":::계산기:::");
		//첫번재 수 입력
		System.out.println("첫 번째 수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		//두번째 수 입력
		System.out.println("두번째 수를 입력해주세요.");
		int b = sc.nextInt();
		int c = a + b;
		//두 수의 합은 몇?
		System.out.println("두 수의 합은 "+c+("입니다."));
	}
}