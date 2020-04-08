package com.jse.inheritance;

//전화기도 팔고, 휴대전화도 팔고... 서비스센터를 만드는 것이 목표
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		PhoneService phones = new PhoneService();

		while (true) {
			switch (JOptionPane.showInputDialog("[0]종료 \n [1]전화입력 \n [2]전화출력 \n "
					+ "[3]휴대폰입력 \n [4]휴대폰출력 \n [5]아이폰입력 \n [6]아이폰출력 \n [7]갤럭시노트입력 \n [8]갤럭시노트출력")) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog("phonenumber, name, company").split(",");
//					JOptionPane.showMessageDialog(null, values); // 왜 new 안해? 상속받은 거라서...
					phones.add(new Phone(values[0], values[1], values[2]));
				}
				/*
				 * 이전거 String msg = JOptionPane.showInputDialog("phonenumber, name, company");
				 * String[] values = msg.split(","); JOptionPane.showMessageDialog(null, msg);
				 * 
				 * for (int i = 0; i < 3; ++i) { String msg2 =
				 * JOptionPane.showInputDialog("[0]종료 [1]입력 [2]출력");
				 * System.out.println("전화기 3대의 전화번호, 이름, 회사를 입력해주세요(-제외)."); phones.add(new
				 * Phone(sc.next(), sc.next(), sc.next())); // 생성자, 파라미터의 파라미터의 파라미터... }
				 */
				break;
			case "2":
				Phone[] phone = phones.getPhone();
				String message = "";
				for (int i = 0; i < 3; ++i) {
					message += String.format("전화번호 : %s, 이름 : %s, 회사 : %s \n", // 오버로딩을 위함
							phone[i].getPhonenumber(), phone[i].getName(), phone[i].getCompany()); // =만 쓰는순간 출력값이 마지막것만
																									// 나오는 오버라이딩 발생
				} // += : 왼쪽 변수에 오른쪽 값을 더하고 그걸 왼쪽 변수에 또다시 준다
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog("phonenumber, name, company, boolean").split(",");
					phones.add(new CellPhone(values[0], values[1], values[2], true)); // split은 배열용이 아닌가? 왜 배열 사이에
																							// 다른 타입을 넣어도 에러가 나지 않는가??
				} // 왜 덮어써도 괜찮은가? values
				break;
			case "4":
				CellPhone[] cellphone = phones.getCellphone();
				String cellvalue = ""; // defalut값을 준다
				for (int i = 0; i < 3; ++i) {
					cellvalue += String.format("전화번호 : %s, 이름 : %s, 회사 : %s, 결과 : %s \n", cellphone[i].getPhonenumber(),
							cellphone[i].getName(), cellphone[i].getCompany(), cellphone[i].getMove());
				}
				JOptionPane.showMessageDialog(null, cellvalue);
				break;
			case "5":
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog("phonenumber, name, company, boolean, search").split(",");
					phones.add(new Iphone(values[0], values[1], values[2], true, values[4])); // 생성자, 배열순서대로
				}
				break;
			case "6":
				Iphone[] iphone = phones.getIphones();
				String message1 = "";
				for (int i = 0; i < 3; ++i) {
					message1 += String.format("전화번호 : %s, 이름 : %s, 회사 : %s, 결과 : %s, 검색어 : %s \n",
							iphone[i].getPhonenumber(),iphone[i].getName(), iphone[i].getCompany(), iphone[i].getMove(), iphone[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message1);
				break;
			case "7":
				for(int i=0; i<3; ++i) {
					String[] values = JOptionPane.showInputDialog("phonenumber, name, company, search, boolean, bigsize").split(",");
					phones.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
				}
				break;
			case "8":
				GalaxyNote[] galaxy = phones.getGalaxynotes();
				String message2 = "";
				for(int i = 0; i < 3; ++i) {
				message2 += String.format("전화번호 : %s, 이름 : %s, 회사 : %s, 결과 : %s, 검색어 : %s, 사이즈 : %s \n",
						galaxy[i].getPhonenumber(), galaxy[i].getName(), galaxy[i].getCompany(), galaxy[i].getMove(), galaxy[i].getSearch(), galaxy[i].getBigsize());
				}
				JOptionPane.showMessageDialog(null, message2);
				break;
			}
		}
	}
}