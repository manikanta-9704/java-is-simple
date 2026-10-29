package com.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapDemo {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("ap", "andhrapradesh");
		   map.put("TS", "Telangana");
	        map.put("TN", "Tamil Nadu");
	        map.put("KA", "Karnataka");
	        map.put("KL", "Kerala");
	        System.out.println(map);

	}

}
