package home.strings;

import java.util.Stack;

public class LongestParanthesisSubString {

	public static void main(String[] args) {
		String s = ")()())";
		
		Stack<Character> st = new Stack<>();
		int longestValidSubstring = 0;
		
		if(!s.isEmpty()) {
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				
				if('('==c) {
					st.push(c);
				}
				else {
					if(!st.isEmpty()) {
						st.pop();
						longestValidSubstring+=2;
					}
				}
			}
		}
		
		System.out.println(longestValidSubstring);
		
	}

}
