package com.jse.phone;
//전화기도 팔고, 휴대전화도 팔고... 서비스센터를 만드는 것이 목표
import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class PhoneController {
	public static void main(String[] args) {
		PhoneServiceImpl phones = new PhoneServiceImpl();
		Phone phone = null;
		String message = "";
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				return;
			case "1":
				phone = new Phone();
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phone.setPhonenumber(values[0]);
					phone.setName(values[1]);
					phone.setCompany(values[2]);
				} break;
			case "2":
			JOptionPane.showMessageDialog(null, phones.printphone()); break;
			case "3":
				
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog(Constants.CELLPHONE_MENU).split(",");
					phone.setPhonenumber(values[0]);
					phone.setName(values[1]);
					phone.setCompany(values[2]);
					phone.setPortable(true);
				} break;
			case "4":
				JOptionPane.showMessageDialog(null, phones.printcell());
				break;
			case "5":
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
					phones.add(new Iphone(values[0], values[1], values[2], true, values[4])); // 생성자, 배열순서대로
				}
				break;
			case "6":
				for (int i = 0; i < 3; ++i) {
					message += iphone[i].toString()+"\n";
					JOptionPane.showMessageDialog(null, message);
				}
				break;
			case "7":
				for (int i = 0; i < 3; ++i) {
					String[] values = JOptionPane.showInputDialog(Constants.GALAXYNOTE_MENU).split(",");
					phones.add(new GalaxyNote(values[0], values[1], values[2], true, values[4], values[5]));
				}
				break;
			case "8":
				for (int i = 0; i < 3; ++i) {
					message += galaxy[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			}
		}
	}
}