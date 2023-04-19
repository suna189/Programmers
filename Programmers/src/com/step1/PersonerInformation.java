package com.step1;

import java.util.Arrays;
import java.util.HashMap;

public class PersonerInformation {
    public int solution() {
    	int[] d = {2,2,3,3};
    	int budget = 10;
    	int sum = 0;
        int answer = 0;
       
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
    		sum = sum + d[i];
    		if(budget - sum >= 0) {
    			answer += 1;
    		}
        }

        return answer;
    }
}
