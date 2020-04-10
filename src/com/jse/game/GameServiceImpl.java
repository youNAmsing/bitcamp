package com.jse.game;

import java.util.Random;
import com.jse.util.Calculator;
import java.util.Random;

public class GameServiceImpl implements GameService {
	private Calculator cal;
	private Random rd;

	public GameServiceImpl() {
		rd = new Random();
		cal = new Calculator();
	}

	public int calculate() {
		int num3 = cal.getNum1() + cal.getNum2();
		return num3;
	}

	public String comval() {
		int dicenum = rd.nextInt(6) + 1;
		String comval = "";
		comval = (dicenum == 1) ? "홀" : "짝";
		comval = (dicenum == 3) ? "홀" : "짝";
		comval = (dicenum == 5) ? "홀" : "짝";
		return comval;
	}

	public String dicecal() {
		rm = new Random();
		int num = rd.nextInt(6) + 1;
		String result = "";
		if (num == 1) {
			result = "홀";
		} else if (num == 2) {
			result = "짝";
		} else if (num == 3) {
			result = "홀";
		} else if (num == 4) {
			result = "짝";
		} else if (num == 5) {
			result = "홀";
		} else {
			result = "짝";
		}
		return result;
	}

public String diceresult() {
	int a = .getUserval();
	int b = rps.getComval();
	String result = "";
	result = (a == b) ? "맞음" : "틀림" ;
	return result;
}

	public int sum() {
		int sum = 0;
		for (int i = 1; i <= 5; ++i) {
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
}