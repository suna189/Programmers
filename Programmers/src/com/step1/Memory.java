package com.step1;

import java.util.HashMap;

public class Memory {
	
	public int[] memory() {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int[] answer = new int[photo.length];
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		for(int i=0; i<photo.length; i++) {
			int sum = 0;
			for(String who : photo[i]) {
				if(map.containsKey(who)) {
					sum += map.get(who);
					System.out.println(sum);
				}
			}
			answer[i] = sum;
		}
		
		return answer;
	}
}
