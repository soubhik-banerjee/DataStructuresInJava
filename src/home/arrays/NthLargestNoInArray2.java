package home.arrays;

import java.util.Arrays;

public class NthLargestNoInArray2 {

	public static void main(String[] args) {
		int a[] = {10,17,1,5,3,8,4,20,7,6,14,15};
		nthLargest(3, a);

	}
	
	private static void nthLargest(int n,int[] a) {
		int[] temp = new int[n];
		int nthLargestPos=temp.length-1;
		int i=0;
		for(;i<n;i++) {
			temp[i]=a[i];
		}
		
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
		for(;i<a.length;i++) {
			if(a[i]>temp[nthLargestPos]) {
				temp[nthLargestPos]=a[i];
			}
			
		}
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("The "+n+"th largest no is: "+temp[nthLargestPos]);
		
	}

}
