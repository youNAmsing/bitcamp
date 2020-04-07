package com.jse.arr;

//카드빈의 상위개념
public class CardService {
	private CardBean[] cards;
	private int count;
	
	public CardService() {
		cards = new CardBean[3];
		count = 0; //카운트가 0부터 시작할 수 있도록 세팅
	} //initialize
	
	public void setCards(CardBean[] cards) {
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
	
	public void add(CardBean card) { //카드 하나하나 가져올 거니까
		//set과 같은 흐름(받아오는 역할)
		cards[count] = card; //0을 할 경우 오버라이딩됨
		//결국 for의 i와 count는 같은 의미
		count++; //실제 데이터의 개수
	}
}
