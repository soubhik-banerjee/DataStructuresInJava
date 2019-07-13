package home.arrays;

import java.util.Stack;

public class NextSmallerElement {

	public static void main(String[] args) {
		int a[] = {5,6,4,10,3,9,8,11};
		int n = a.length;
		int [] res = new int[n];
		Stack<Integer> s = new Stack<>();
		for (int i=n-1;i>=0;i--) {
			if(i==n-1) {
				s.push(a[i]);
				res[i] = a[i];
			}
			
			else {
				while(!s.isEmpty() && a[i]<s.peek()) {
					s.pop();
				}
				
				int top = 0;
				if(s.isEmpty()) {
					top = a[i];
				}
				else {
					top = s.peek();
				}
				
				res[i] = top;
				s.push(a[i]);
			}
		}
		
		for(int e:res) {
			System.out.println(e+",");
		}

	}

}
