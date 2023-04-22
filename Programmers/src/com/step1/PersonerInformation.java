package com.step1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PersonerInformation {
	public int[] solution () throws ParseException {
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		List<Integer> answer = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<terms.length; i++) {
			Object[] term = terms[i].split(" ");
			map.put(term[0].toString(), Integer.parseInt(term[1].toString()));
		}
		for(int i=0; i<privacies.length; i++) {
			String[] privacie = privacies[i].split(" ");
			String[] privacieDate = privacie[0].split("\\.");
			
			int priYear = Integer.parseInt(privacieDate[0]);
			int priMonth = Integer.parseInt(privacieDate[1]);
			int priDay = Integer.parseInt(privacieDate[2]);
			int month = priMonth + map.get(privacie[1]);
			
			if(month > 12) {
				priYear += 1;
				month -= 12;
			}

			String priDate = "";
			
			if(month < 10) {
				priDate = String.valueOf(priYear) + ".0" + String.valueOf(month);
			} else {
				priDate = String.valueOf(priYear) + "." + String.valueOf(month);
			}
		
			if(priDay < 10) {
				priDate += ".0" + String.valueOf(priDay);
			} else {
				priDate += "." + String.valueOf(priDay);
			}
			
			System.out.println(priDate);
			System.out.println(privacie[1] + " " + map.get(privacie[1]));
		
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd");
			Date date = formatter.parse(priDate);
			Date todays = formatter.parse(today);
			
			if(date.compareTo(todays) <= 0) {
				answer.add(i+1);
			}
		}
		
		return answer.stream().mapToInt(integer -> integer).toArray();
	}
}
