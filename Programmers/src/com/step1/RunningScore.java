package com.step1;

import java.util.HashMap;

public class RunningScore {
	public String[] runningScore() {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
	        
		HashMap<String, Integer> map = new HashMap<>(); 
		
		for(int i=0; i<players.length; i++) {
			map.put(players[i], i);	
		}
		
		
		for(int i=0; i<callings.length; i++) {
			String player = players[map.get(callings[i])-1];
	
			players[map.get(callings[i])-1] = callings[i];
			map.put(callings[i], map.get(callings[i])-1);
			players[map.get(callings[i])+1] = player;
			map.replace(player, map.get(callings[i])+1);
		
		}
        
	    return players;
	}
}