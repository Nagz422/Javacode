package com.basic.trickyPrg;

public class Test {
	public static void main(String[] args) {
		int num = 10;
		modifyPrimitive(num);
		System.out.println("value of num is: "+ num);
	}

	private static void modifyPrimitive(int num) {
		num = 20;
	}
}
//Output is 10