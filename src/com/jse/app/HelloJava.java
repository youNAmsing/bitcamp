package com.jse.app;
//폴더  / 이름
import java.util.Scanner;
// 소문자() 있으면 메서드, 없으면 변수
public class HelloJava {
//파일  / 이름 : 클래스를 declare한다. implicit -> not initialize
	public static void main(String[] args) {
//							파라미터값 으로 클래스의 ()안이 정해짐
//			메인 메서드를 declare한다. implicit -> not initialize
/*	로컬변수는 메서드 안에 있는 모든 변수, 거의 인스턴스변수
		//파일			       메서드			  변수
		Scanner scanner = new Scanner(System.in);
//		클래스 인스턴스(로컬)변수 = 예약어 클래스(클래스.클래스변수)
		System.out.println("이름이 뭐에요?");
		클래스 변수가 이 메서드를 가지고온다(상수)
		String name = scanner.next();
//	 	클래스 인스턴스변수 = 인스턴스변수.인스턴스메서드
		System.out.println("안녕하세요, "+name+"씨.");
//  	클래스.클래스변수.클래스메서드("상수"+변수+"상수")
		System.out.println("어디 사세요?");
		name = scanner.nextLine();
		System.out.println("아, "+name+" 좋은 곳이죠.");
//	  	클래스.변수.메서드("상수(변하지않음)"+변수+"상수")
		System.out.println("나이가 어떻게 되세요?");
		int age = scanner.nextInt();
		데이터타입 기본형(로컬)변수(원래 인스턴스인데 너무많이 쓰여서 못바꾼거임) assign 
//		type variable assign(할당) scanner.explicit(명확한)데ㄷ method
//		field는 변수의 타입을 할당한다
		System.out.println(age+"살이시네요.");
		System.out.println("키는 몇이고, 몸무게는 몇 kg에요?");
		float height = scanner.nextFloat();
		타입 로컬변수
		double weight = scanner.nextDouble();
		타입 로컬변수
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.next().charAt(0);
*/
	int a = 0;
//	데이터타입 로컬변수
//  변수를 declare한다. explicit -> initialize
//  initialize 명시하므로 선언 뒤에 반드시 초기화를 해주어야 함
//  선언이 먼저 되어야 함
	System.out.println(a);
	}
}
//보라색 : 예약어
//시스템 안에 있는 패키지는 파란색 이태리 : System.in, System.out
//갈색 : 변수.
		
		
		
		