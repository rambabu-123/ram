package com.mondee;

public class Restaruant {
	IHotDrink hotdrink;
	Restaruant(IHotDrink hotdrink){
		this.hotdrink=hotdrink;
	}
	public void prepareIHotDrink() {
		hotdrink.prepareIHotDrink();
	}

}
