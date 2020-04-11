package com.din.constructor;

public class parcons {
	
	String animal_name;
	String animal_type;
	
	parcons(){
		
		System.out.println("I am no argument constructor");
	}

	parcons(String name,String type){
		
		animal_name=name;
		animal_type=type;
	}
	
	public void sayAboutAnimal() {
		
		System.out.println("Animal name is "+animal_name+" and type is "+ animal_type);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parcons obj = new parcons();
		
		parcons obj1=new parcons("deer","omni");
		obj1.sayAboutAnimal();
		
		parcons obj2=new parcons("lion","omni");
		obj2.sayAboutAnimal();
		
		
		
		
	}

}
