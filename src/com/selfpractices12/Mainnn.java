package com.selfpractices12;

	import java.util.HashMap;

	import java.util.Map;
	public class Mainnn {
		public static void display(Map<String, Integer> map) {
			if (!map.isEmpty()) {
				for (String keys : map.keySet()) {
					System.out.println(keys + " : " + map.get(keys));
				}
			}else{
			  	System.out.println("map is empty");
			}
		}
		public static void main(String[] args) {
			Map<String, Integer> map = new HashMap<>();
			map.put("mango", 10);
			map.put("apple", 30);
			map.put("orange", 20);
			display(map);
			map.clear();
			display(map);
		}
	}
