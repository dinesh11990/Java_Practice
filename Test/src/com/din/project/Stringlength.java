package com.din.project;

public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "dineshbabu";
		
		//System.out.println(name.length());
		
		char[] obj = name.toCharArray();
		
		int length = 0;
		
		for(char c:obj) {
			
		length++;
		
		}
		System.out.println(length);
		
	}

}
