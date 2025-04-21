package com.basic;

public class StrPolindromPointers {
	
	public static void main(String[] args) {
		String s = "amma";
		int len = s.length();
		System.out.println(len);
		boolean status = false;
		
		for(int i =0; i<len/2; i++) {
			if(s.charAt(i)!=s.charAt(len-i-1))
				status = false;
			else
				status = true;
		}
		if(status)
			System.out.println("Given String is polindrom");
		else
			System.out.println("Given String is not polindrom");
	}
}
