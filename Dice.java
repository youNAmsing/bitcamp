package com.jse.app;

import java.util.Scanner;
import java.util.Random;
//시나리오 : 
public class Dice { //이 아래가 statement인것, class가 statement는 아직 아님
//주사위 : 1~6 랜덤의 수가 나와야 함
//expression : ; 있는 것
	public static void main(String[] args) {
		System.out.println(":::주사위 홀짝 맞추기 게임:::");
		System.out.println("기대하는 값(홀/짝)을 입력해주세요");
		Scanner sc = new Scanner(System.in);
// 시스템에서 가져오는 값이기 때문에 System.in이 필요하다
		String expect = sc.next();

		Random rd = new Random();
// 시스템에서 가져오는 값이 아니고 내부에서 처리하는 값이기 때문에 System.in이 필요없다
		int a = rd.nextInt(6)+1;
		System.out.print("결과값 : "+a);
// 정수는 0부터 시작이기 때문에 주사위는 1부터 시작이라 +1을 해주어야 한다
		String result = "";
			if(a == 1) {
			result = "홀";
			}else if(a == 2) {
			result = "짝";
			}else if(a == 3) {
			result = "홀";
			}else if(a == 4) {
			result = "짝";
			}else if(a == 5) {
			result = "홀";
			}else {
			result = "짝";
			}
		System.out.println("홀짝 결과 : "+a);
		System.out.println("맞음");
		System.out.println("틀림");
		}
	}