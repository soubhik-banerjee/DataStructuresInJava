package home.arrays;

import java.util.Deque;
import java.util.LinkedList;

public class MaxElementInSlidingWindow {

	public static void main(String[] args) {
		int arr[]={12, 1, 78, 90, 57, 89, 56};
        int k=3;
        printMax(arr, arr.length,k);
	}
	
	static void printMax(int arr[],int n, int k) {
		Deque<Integer> dq = new LinkedList<>();
		int i;
		
		for(i=0;i<k;i++) {
			
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
				dq.removeLast();
			}
			
			dq.addLast(i);
		}
		
		for(;i<n;i++) {
			System.out.println("Max Element : "+arr[dq.peek()]);
			
			while(!dq.isEmpty() && dq.peekFirst()<=(i-k)) {
				dq.removeFirst();
			}
			
			while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]) {
				dq.removeLast();
			}
			
			dq.addLast(i);
		}
		System.out.println("Max Element : "+arr[dq.peek()]);
	}

}
