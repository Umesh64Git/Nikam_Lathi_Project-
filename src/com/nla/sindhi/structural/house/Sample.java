package com.nla.sindhi.structural.house;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1,"Dilip");
		map.put(2,"Rekha");
		map.put(3,"Rajesh");		
		map.put(4,"Ashwini");
		map.put(5,"Umesh");
	
		Set<Integer> s = map.keySet();
		for(Integer i : s) {
			System.out.println("key==>"+i);
			System.out.println("Values==>"+map.get(i));
		}
	}

}
