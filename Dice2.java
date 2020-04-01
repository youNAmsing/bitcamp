package com.jse.app;
//알고리즘, == vs equals, 시나리오
import java.util.Scanner;
import java.util.Random;
//시나리오를 잊지 말 것
public class Dice2 { //이 아래가 statement인것, class가 statement는 아직 아님
//주사위 : 1~6 랜덤의 수가 나와야 함
//expression : ; 있는 것
	public static void main(String[] args) {
//		메서드 가져오기
		switchDice();
	}
		static void switchDice() {
			System.out.println(":::주사위 홀짝 맞추기 게임:::");
			System.out.println("홀/짝 중 하나만 선택해주세요~");
			Scanner sc = new Scanner(System.in);
			String answer = sc.next();
			System.out.println(String.format("사용자가 입력한 값 : %s ", answer));
			Random rd = new Random();
			int dice = rd.nextInt(6)+1;
			String result = "";
			switch(dice) {
			case 1: result = "홀"; break;
			case 2: result = "짝"; break;
			case 3: result = "홀"; break;
			case 4: result = "짝"; break;
			case 5: result = "홀"; break;
			case 6: result = "짝"; break;
			}
			System.out.println("컴퓨터 결과 : "+result);
			String result2 = "";
			if(answer.equals(result)) {
				result2 = "맞음";
			}else {
				result2 = "틀림";
			}
			System.out.println(String.format("결과 : %s ", result2));
		}
/*
			if(dice%2 == 0) {
			System.out.println("짝수입니다!");
			}else {
			System.out.println("홀수입니다!");	
			}
*/

/* statement와 expression만 존재하는 부분 : 알고리즘 이라고 한다
		System.out.println(":::주사위 홀짝 맞추기 게임:::");
		System.out.println("기대하는 값(홀/짝)을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("사용자 선택값 : "+a);
		Random rd = new Random();
		int b = rd.nextInt(6)+1;
		System.out.println("컴퓨터 출력값 : "+b);
		String result = "";
		if(b == 1) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else if(b == 2) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(b == 3) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else if(b == 4) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(b == 5) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(a.equals(result)) {//object type의 operation은 method로 처리한다
			System.out.println("맞음");	
		}else{
			System.out.println("틀림");
		}
*/		

	static void dice() {
		System.out.println(":::주사위 홀짝 맞추기 게임:::");
		System.out.println("기대하는 값(홀/짝)을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(String.format("사용자 선택값 : %s ", a));
		Random rd = new Random();
		int b = rd.nextInt(6)+1;
		System.out.println("컴퓨터 출력값 : %d"+b);
		String result = "";
		if(b == 1) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else if(b == 2) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(b == 3) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else if(b == 4) {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(b == 5) {
			System.out.println("컴퓨터 홀짝 결과 : 홀");
			}else {
			System.out.println("컴퓨터 홀짝 결과 : 짝");
		}
		if(a.equals(result)) {//object type의 operation은 method로 처리한다
			System.out.println("맞음");	
		}else{
			System.out.println("틀림");
		}
	
	}
}