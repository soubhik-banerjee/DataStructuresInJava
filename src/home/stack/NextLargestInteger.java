package home.stack;

import java.util.Stack;

public class NextLargestInteger {

	public static void main(String[] args) {
		int[] input={3,4,5,2,7,5,7,3,8,2,5,7,9,1,3};
		int [] output = new int[input.length];
		Stack<Integer> st = new Stack<>(); 
		for(int i=input.length-1;i>=0;i--) {
			int currentElement = input[i];
			if(st.isEmpty()) {
				st.push(1);
				output[i]=1;
			}
			while(!st.isEmpty() && st.peek()<currentElement) {
				st.pop();
			}
			output[i]=(st.isEmpty()?1:(st.peek()-i));
			st.push(i);
		}

		for(int i=0;i < output.length;++i)
		{
			System.out.print(output[i]+",");
		}

	}

}

