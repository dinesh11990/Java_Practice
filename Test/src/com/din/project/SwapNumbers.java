package com.din.project;

public class SwapNumbers {
	
	static {
		int mySalary = 20;
		int mySuperior =50;
		
		System.out.println("My salary was "+mySalary+" My Superior salary "+mySuperior);
		
		int temp = mySalary;
		mySalary = mySuperior;
		mySuperior = temp;
		
		System.out.println("Now mysalary is "+mySalary+" My superior salary is "+mySuperior);
	}
	
	public static void test() {
		
		System.out.println("this block will execute second");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*swapNumbers obj = new swapNumbers();
		obj.test();*/
		test();
		
	}

}
