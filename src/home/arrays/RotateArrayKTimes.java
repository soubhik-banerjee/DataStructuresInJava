package home.arrays;

import java.util.Arrays;

/**
 * Rotate an array k times.
 * if array = [1,2,3,4,5,6,7] and k=3
 * After rotation array = [5,6,7,1,2,3,4]
 * 
 * Steps: Reverse first k positions,starting from 0.
 * Reverse the left over positions, starting from k+1.
 * Reverse the whole array.
 *
 */

public class RotateArrayKTimes {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};//4,3,2,1,7,6,5--->5,6,7,1,2,3,4
		int kPlaces=2;
		System.out.println("Before rotation : "+Arrays.toString(arr));
		rotateToRight(arr,kPlaces);
		System.out.println("After rotation of "+kPlaces+" places : "+Arrays.toString(arr));
	}
	
	private static void rotateToRight(int [] a,int k) {
		reverse(0,k,a);
		reverse(k+1,a.length-1,a);
		reverse(0,a.length-1,a);
	}
	
	private static void reverse(int start,int end,int[]a) {
		int count=0;
		for(int i=start;i<=(start+end)/2;i++) {
			int temp = a[i];
			a[i] = a[end-count];
			a[end-count]=temp;
			count++;
		}
	}

}
