package com.din.practice;

public class Clio extends AbstractPractice implements UpcomingProject, Interface2{
	
	@Override
	public void engineSecret() {
		
		System.out.println("Clio Engine secret revealed");
	}
	
	/*@Override
	public void carDashboar() {
		
		System.out.println("Clio Dashboard revealed");
	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractPractice obj = new Clio();
		obj.engineSecret();
		obj.carDashboar();
		
		UpcomingProject obj1 = new Clio();
		obj1.patientDisease();
	
	}

	@Override
	public void carDashboar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void patientDisease() {
		// TODO Auto-generated method stub
		
		System.out.println("Here I have attached the patients information");
		
	}

	@Override
	public void blockId() {
		// TODO Auto-generated method stub
		
		System.out.println("Here you have information about blockID");
		
	}

}
