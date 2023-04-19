package com.step1;

import java.util.ArrayList;
import java.util.List;

public class Babbling {
	public int babbling() {
		int answer = 0;
		String[] words = {"aya", "ye", "woo", "ma"};
		String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		List<String[]> splitWord = new ArrayList<String[]>();
		
		for(int i=0; i<babbling.length; i++) {
			String[] temp = babbling[i].split("aya|ye|woo|ma");
			splitWord.add(temp);
		}
		
		for(int i=0; i<splitWord.size(); i++) {
			if(splitWord.get(i).length == 0) {
				answer++;
			}
		}
		return answer;
	}
}
