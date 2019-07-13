package home.strings;

import java.util.Stack;

public class MinimumNoOfBracketReversals {

	public static void main(String[] args) {
		String expr = "{{{{}}";
		System.out.println(countMinReversals(expr));
	}

	private static int countMinReversals(String expr) {
		Stack<Character> s = new Stack<>();
		int count = 0;
		
		if(expr.length()%2!=0) {
			throw new RuntimeException("Expression is unbalanced");
		}
		
		for(int i=0;i<expr.length();i++) {
			char currChar = expr.charAt(i);
			
			if(s.isEmpty()) {
				s.push(currChar);
			}
			else {
				char lastChar = s.pop();
				
				if(currChar==lastChar) {
					s.push(lastChar);
					s.push(currChar);
				}
				else if(currChar=='{'){
					count+=2; 
				}
			}
		}
		// if the stack is still not empty, means we have traversed the entire String and only '{' or '}' characters remain in the stack.
		// so minimum number of reversals needed to make the expression balanced will be half of those in the stack.
		// for e.g if stack = ['{','{'] then we would need one reversal to make it balanced.
		
		if(!s.isEmpty()) {
			count = count+(s.size()/2);
		}
		
		return count;
	}

}
