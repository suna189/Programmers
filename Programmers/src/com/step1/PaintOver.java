package com.step1;

public class PaintOver {
	public int solution() {
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};
        int answer = 0;
        int max = 0;
        
        for(int i=0; i<section.length; i++) {
        	if(section[i] > max) {
        		answer ++;
        		max = section[i]  + m -1;
        	}
        }
        
        
        return answer;
    }
}
