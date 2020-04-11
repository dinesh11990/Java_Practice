package com.din.practice;

public class Audi extends AbstractPractice {
	

	@Override
	public void engineSecret() {
		
		System.out.println("Audi Engine secret revealed");
	}
	
	@Override
	public void carDashboar() {
		
		System.out.println("Audi Dashboard revealed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractPractice obj = new Audi();
		obj.carDashboar();
		obj.engineSecret();
	
	}

}
