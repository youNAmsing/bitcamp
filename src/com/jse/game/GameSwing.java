package com.jse.game;

import javax.swing.JFrame;

public class GameSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("회원관리");
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
