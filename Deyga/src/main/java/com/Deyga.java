package com;

import java.util.List;

public class Deyga {

	private List<Shop> shop;
	
	

	public Deyga() {
		super();
	}

	public Deyga(List<Shop> shop) {
		super();
		this.shop = shop;
	}

	public List<Shop> getShop() {
		return shop;
	}

	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}

	@Override
	public String toString() {
		return "Deyga [shop=" + shop + "]";
	}
	
	
}
