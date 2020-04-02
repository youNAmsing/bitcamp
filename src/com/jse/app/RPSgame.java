package com.jse.app;
//서버
import java.util.Random;

public class RPSgame {
	private int userval; // uservalue
	private int comval; // computervalue

	public void setUserval(int userval) {
		this.userval = userval;
	}

	public int getUserval() {
		return userval;
	}

	public void setComval(int comval) {
		this.comval = comval;
	}

	public int getComval() {
		return comval;
	}

	public String game() {
		String result = "";
		if (userval == comval) {
			result = "무승부!";
		} else if (userval == 1 && comval == 2) {
			result = "패배!";
		} else if (userval == 1 && comval == 3) {
			result = "승리!";
		} else if (userval == 2 && comval == 1) {
			result = "승리!";
		} else if (userval == 2 && comval == 3) {
			result = "패배!";
		} else if (userval == 3 && comval == 1) {
			result = "패배!";
		} else {
			result = "승리!";
		}
		return result;
	}
}