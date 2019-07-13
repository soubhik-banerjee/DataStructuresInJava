package home.arrays;

import java.util.Arrays;

public class NthLargestNoInArray {

	public static void main(String[] args) {
		int a[] = {10,17,1,5,3,8,4,20,7,6,14,15};
		nthLargest(4, a);
	}

	private static void nthLargest(int n,int[] a) {
		System.out.println("Array : "+Arrays.toString(a));
		int lElem = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
					if(a[j]>a[i]) {
						lElem++;
						if(lElem>(n-1)) {
							break;
						}
					}
				}
			}
			if(lElem==n-1) {
				System.out.println(n+"th largest element : "+a[i]);
				break;
			}
			else {
				lElem=0;
			}
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
