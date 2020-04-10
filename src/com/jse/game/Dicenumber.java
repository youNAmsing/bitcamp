package com.jse.game;
//서버
public class Dicenumber {
	private String expect;
	private int dicenum;

	public void setExpect(String expect) {
		this.expect = expect;
	}

	public String getExpect() {
		return expect;
	}

	public void setDicenum(int dicenum) {
		this.dicenum = dicenum;
	}

	public int getDicenum() {
		return dicenum;
	}

	public String switchDice() {
		String com = "";
		switch (dicenum) {
		case 1:
			com = "홀";
			break;
		case 2:
			com = "짝";
			break;
		case 3:
			com = "홀";
			break;
		case 4:
			com = "짝";
			break;
		case 5:
			com = "홀";
			break;
		case 6:
			com = "짝";
			break;
		}
		String result = "";
		if (expect.equals(com)) {
			result = "맞음";
		} else {
			result = "틀림";
		}
		return result;
	}

}
