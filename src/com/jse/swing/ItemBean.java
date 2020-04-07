package com.jse.swing;

public class ItemBean {
	private ItemBean[] items;
	
	public ItemBean() {
		this.items = new ItemBean[4];
		
	}
	
	public void setItem(ItemBean[] item) {
		this.items = items;
	}
	
	public ItemBean[] getItem() {
		return items;
	}
}
