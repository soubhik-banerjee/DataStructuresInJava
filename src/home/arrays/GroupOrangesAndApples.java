package home.arrays;

import java.util.Arrays;

/**
 * This grouping is based on sorting. Here selection sort has been used.
 *
 */
public class GroupOrangesAndApples {

	public static void main(String[] args) {
		String[] arr = {"apple","orange","orange","apple","apple","orange","orange","apple","orange","apple"};
		System.out.println("Before : "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			int orangeIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals("apple") && arr[j].equals("orange")) {
					orangeIndex=j;
				}
			}
			
			if(orangeIndex!=i) {
				String orange = arr[orangeIndex];
				arr[orangeIndex] = arr[i];
				arr[i] = orange;
			}
		}
		System.out.println("After : "+Arrays.toString(arr));
	}

}
