package com.din.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class arrayList {
	
	public arrayList() {
		
		List<String> obj=new ArrayList<String>();
		obj.add("CTS");
		obj.add("TCS");
		obj.add("MNC");
		obj.add(null);
		
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.indexOf("TCS"));
		
		/*for (String string1 : obj) {
			System.out.println(string1);*/
		
		/*for(int i=0;i<obj.size();i++) {
			
			System.out.println("result:"+obj.get(i));*/
		
		
		ListIterator<String> iter =obj.listIterator();
		
		while (iter.hasNext()) {
			//String string = (String) iter.next();
			System.out.println(iter.next());
			
		}
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arrayList obj1=new arrayList();
		
		

	}

}
