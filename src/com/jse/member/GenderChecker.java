package com.jse.member;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		find();
	}
	static void find() {
		System.out.println(":::성별 판별기:::");
		System.out.println("주민등록번호를 입력해주세요(-포함)");
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		System.out.println(String.format("주민번호 : %s ", number));
		
		char ch = number.replace("-","").charAt(6); // 0~6까지
/*
		String a = ""; - double(switch 또한 case "1")
		char a = ''; - single (switch 또한 case '1')
*/
		String gender = "";
		switch(ch) {
		case '1' : case '3' : gender = "남성"; break; //1, 3
		case '2' : case '4' : gender = "여성"; break; //2, 4
		case '5' : case '6' : gender = "외국인"; break; //5, 6
		default : ;//나머지 경우의 수는 디폴트값
//or 애초에 gender을 틀렸습니다 로 지정하고 default를 없애도 됨
		}
		System.out.println(gender);
	}
}