package home.arrays;

import java.util.Arrays;
import java.util.List;

public class DeliveryTruckShortestDistance {

	public static void main(String[] args) {
		DeliveryTruckShortestDistance obj = new DeliveryTruckShortestDistance();
		List<List<Integer>> area = Arrays.asList(
				Arrays.asList(1,0,0),
				Arrays.asList(1,1,1),
				Arrays.asList(1,0,9)
				);
		obj.minimumDistance(3, 3, area);

	}
	
	private int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
    {
		int sum = 0;
		
		for(int i=0;i<numRows;) {
			for(int j=0;j<numColumns;) {
				
				if(area.get(i).get(j)==9) {
					System.out.println("distance: "+sum);
					return sum;
				}
				else if(area.get(i).get(j)==1) {
					sum = sum+area.get(i).get(j);
					j++;
					if(j==numColumns-1) {
						i++;
					}
				}
				else {
					if(area.get(i+1).get(j-1)==1) {
						i++;
						j--;
					}
					else if(area.get(i+1).get(j)==1) {
						i++;
					}
					else if(area.get(i+1).get(j+1)==1) {
						i++;
						j++;
					}
				}
			}
		}
		
		if(sum==0) {
			sum=-1;
		}
		
		return sum;
    }

}
