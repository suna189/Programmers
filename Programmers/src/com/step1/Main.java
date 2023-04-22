package com.step1;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		PersonerInformation personerInformation = new PersonerInformation();
		int[] answer = personerInformation.solution();
		
		
		System.out.println("===============");
		for(int num : answer) {
			System.out.println(num);
		}
	}
}
