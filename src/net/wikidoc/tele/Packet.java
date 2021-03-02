package net.wikidoc.tele;

import java.util.ArrayList;

public class Packet {
	//item의 개수는 가변적이기 때문에 ArrayList를 이용해서 item 객체를 이용
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public Item getItem(int index) {
		return this.items.get(index);
	}
	
	public String raw() {
		StringBuffer result = new StringBuffer();
		for(Item item: items) {
			result.append(item.raw());
		}
		return result.toString();
	}
}
