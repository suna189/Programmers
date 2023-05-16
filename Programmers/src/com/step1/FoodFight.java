package com.step1;


public class FoodFight {
	public String solution() {
		int[] food = {1,3,4,6};
		String answer = "0";
		
		for(int i=food.length-1; i>0; i--) {
			for(int j=0; j<food[i]/2; j++) {
				answer = i + answer + i;
			}
		}
	
		return answer;
	}
}
