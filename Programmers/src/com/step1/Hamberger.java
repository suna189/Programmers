package com.step1;

import java.util.Stack;

public class Hamberger {
    public int solution() {
    	int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<ingredient.length; i++) {
    	   stack.push(ingredient[i]);
    	   if(stack.size() >= 4) {
               if(stack.get(stack.size()-4) == 1 && stack.get(stack.size()-3) == 2
                       && stack.get(stack.size()-2) == 3 && stack.get(stack.size()-1) == 1) {
                   answer++;
                   stack.pop();
                   stack.pop();
                   stack.pop();
                   stack.pop();
               }
           }
        }
        return answer;
    }
}
