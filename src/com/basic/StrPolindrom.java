package com.basic;

public class StrPolindrom {
	
	public static void main(String[] args) {
		String str = "abba";
		int left = 0, right = str.length()-1;
		boolean status=false;
		
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right))
				status = false;
			else
				status = true;
			left++;
			right--;
		}
		
		if(status)
			System.out.println("given string is polindrom");
		else
			System.out.println("given string is not polindrom");
	}
}
