package com.lining.skills.assessment.skills_assesement.enums;

import java.util.HashMap;
import java.util.Map;

public class Rank {
	private static final Map<String, Integer> ranks = new HashMap<String, Integer>();
	static {
		ranks.put("A",1); 
		ranks.put("2", 2); 
		ranks.put("3", 3); 
		ranks.put("4", 4); 
		ranks.put("5", 5);
		ranks.put("6", 6); 
		ranks.put("7", 7);
		ranks.put("8", 8);
		ranks.put("9", 9); 
		ranks.put("10", 10); 
		ranks.put("J", 10);
		ranks.put("Q", 10);
		ranks.put("K", 10);
	}
	
	public static boolean isValidRank(String rank) {
		if (ranks.containsKey(rank)) {
			return true;
		} else {
			return false;
		}
	}
	

	

}
