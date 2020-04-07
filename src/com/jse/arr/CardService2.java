package com.jse.arr;
//카드서비스보다 상위개념
public class CardService2 {
	private CardBean[][] cardbox;
	
	public CardService2() {
		cardbox = new CardBean[3][10]; //3장짜리 10개묶음
	}
	
	public void setCardbox(CardBean[][] cardbox) {
		this.cardbox = cardbox;
	}
	
	public CardBean[][] getCardbox() {
		return cardbox;
	}
	
	
}
