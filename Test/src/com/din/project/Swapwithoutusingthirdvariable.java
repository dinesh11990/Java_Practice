package com.din.project;

public class Swapwithoutusingthirdvariable {

	public Swapwithoutusingthirdvariable(){
		
		int first = 20;
		int second = 50;
		
		System.out.println("Before my salary was "+first+" My boss salary was "+second);
		
		first = first-second;
		second = first+second;
		first = second-first;
		
		System.out.println("After my salary was "+first+" My boss salary was "+second);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swapwithoutusingthirdvariable obj = new Swapwithoutusingthirdvariable ();
		
		
	}

}
