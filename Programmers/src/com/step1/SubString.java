package com.step1;

public class SubString {
	public int solution() {
		String t = "10203";
		String p = "15";
		int pLength = p.length();
		long pValue = Long.parseLong(p);
		int answer = 0;
      
        for(int i= 0; i<=t.length()- pLength; i++) {
        	long tValue = Long.parseLong(t.substring(i, i+pLength));
        	if(tValue <= pValue) {
        		answer++;
        	}
        	System.out.println(tValue);
        }
        
        return answer;
    }
}
