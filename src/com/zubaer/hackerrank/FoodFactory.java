package com.zubaer.hackerrank;

public class FoodFactory {

	public Food getFood(String order) {
		if(order.equalsIgnoreCase("pizza")) {
			return new Pizza();
		}if(order.equalsIgnoreCase("cake")) {
			return new Cake();
		}
		return null;
	}
}
