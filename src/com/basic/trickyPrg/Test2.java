package com.basic.trickyPrg;

public class Test2 {
	public static void main(String[] args) {
		int num = 10;
		num = modifyPrimitive(num);
		System.out.println("value of num is: "+ num);
	}

	private static int modifyPrimitive(int num) {
		num = 20;
		return num;
	}
}
//Output is 20