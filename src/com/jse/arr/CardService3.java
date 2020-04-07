package com.jse.arr;

public class CardService3 {
	private CardBean[][][] cardcontainer;
	public CardService3() {
		cardcontainer = new CardBean[3][10][100];
	}
	
	public void setCardcontainer(CardBean[][][] cardcontainer) {
		this.cardcontainer = cardcontainer;
	}
	
	public CardBean[][][] getCardcontainer() {
		return cardcontainer;
	}
}
