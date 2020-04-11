package com.din.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Stringreverse {

	public static void main(String[] args) {
		
		// Using Stringbuffer
		
		/*String name= "dinesh";
		StringBuffer obj = new StringBuffer();
		obj.append(name);
		System.out.println(obj.reverse());*/
		
		
		//Using Own method
		
		/*String name = "harish";
		char[] charArray = name.toCharArray();
		
		String reverse="";
		for(int i=charArray.length-1;i>=0;i--)
		{
		
			reverse = reverse+charArray[i];
			
			System.out.println(reverse);
		}*/
		
		String name="Agni";
		char[] obj1=name.toCharArray();
		
		List<Character> obj2=new ArrayList<Character>();
		
		for (Character obj3 : obj1) {
			obj2.add(obj3);
			
		}
		Collections.reverse(obj2);
		
		ListIterator<Character> iterator = obj2.listIterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		}

}
