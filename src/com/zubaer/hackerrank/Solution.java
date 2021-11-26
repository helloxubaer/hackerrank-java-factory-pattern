package com.zubaer.hackerrank;

public class Solution {
	public static void main(String args[]) {
		// without factory design //
		//Food thePizza = new Pizza();
		//System.out.println("---"+thePizza.getType());
		
		// *************************** //
		// with factory design pattern //
		// Create factory instance
		FoodFactory theFoodFactory = new FoodFactory();
		
		// get  food implementation classes from factory instance
		Food food = theFoodFactory.getFood("pizza");
		System.out.println(food.getType()+food.getClass());
	}
}
