package com.jse.member;
import java.awt.FlowLayout;
import javax.swing.*;

public class MemberSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("회원관리"); //레이아웃
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("회원가입");
        JButton button = new JButton();
        button.setText("확인");
        panel.add(button);
        panel.add(label);
        frame.add(panel); //여러개 갖는다
		frame.setVisible(true);
	}
}