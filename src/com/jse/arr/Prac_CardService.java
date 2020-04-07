package com.jse.arr;
//다일개체 : 여러개 받기!
public class Prac_CardService {
	private CardBean[] cards;
	private int count;

	public Prac_CardService() {
		cards = new CardBean[5];
	}
	
	public void setCards(CardBean[] cards) {//set으로 받으면 오버라이딩 발생
		this.cards = cards;
	}
	
	public CardBean[] getCards() {
		return cards;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void add(CardBean card) { //set같은 역할, 오버로딩
		cards[count] = card;
		count++;
	}
}
