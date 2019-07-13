package home.stack;

import java.util.Stack;

public class NextSmallerInteger {

	public static void main(String[] args) {
		int[] input={3,4,5,2,7,5,7,3,8,2,5,7,9,1,3};
		int [] output = new int[input.length];
		Stack<Integer> st = new Stack<>(); 
		for(int i=input.length-1;i>=0;i--) {
			int currentElement = input[i];
			if(st.isEmpty()) {
				st.push(0);
				output[i]=0;
			}
			while(!st.isEmpty() && st.peek()>currentElement) {
				st.pop();
			}
			output[i]=(st.isEmpty()?0:st.peek());
			st.push(currentElement);
		}
		
		for(int i=0;i < output.length;++i)
		  {
		   System.out.print(output[i]+",");
		  }

	}

}
