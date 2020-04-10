package com.jse.game;
import java.util.Random;

public class RPSgame {
	private int userval;
	private int comval;
	Random rm;

	public int getUserval() {
		return userval;
	}

	public void setUserval(int userval) {
		this.userval = userval;
	}
	
	public void setComval(int comval) {
		this.comval = comval;
	}

	public int getComval() {
		return comval;
	}
}