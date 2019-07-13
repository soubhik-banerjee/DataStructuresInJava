package home.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArraysWithSpace {

	public static void main(String[] args) {
	 List<Integer> list1 = Arrays.asList(5,2,4,5,9,9);	//0,1,2,2,3,4
	 List<Integer> list2 = Arrays.asList(5,0,1,2,3,4);	

	 List<Integer> result = mergeArrays(list1, list2);
	 
	 for(int num:result) {
		 System.out.println(num);
	 }
	}
	private static List<Integer> mergeArrays(List<Integer> a, List<Integer> b) {
		
		List<Integer> resultList = new ArrayList<>();

        int i=1;
        int j=1;

        int aSize=a.get(0);
        int bSize=b.get(0);

        while(i<aSize && j<bSize){
            if((a.get(i)<b.get(j)) || (a.get(i)==b.get(j) && i<j)){
               resultList.add(a.get(i)) ;
               i++;
            }
            else if((b.get(j)<a.get(i)) || (a.get(i)==b.get(j) && i>j)){
                resultList.add(b.get(j));
                j++; 
            }
      
        }

        if(i<aSize){
            for(;i<=aSize;i++){
                resultList.add(a.get(i));  
            }
        }

        else if(j<bSize){
            for (; j <= bSize; j++) {
                resultList.add(a.get(j));
            } 
        }

        return resultList;

	}

}
