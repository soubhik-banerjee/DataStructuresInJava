package home.strings;

import java.util.HashMap;
import java.util.Map;

public class AirplaneReservation {

	public static void main(String[] args) {
		solution(1, "");
	}
	
	private static void solution(int N,String S) {
		String[][] seats = new String[N][10];
		Map<Character,Integer> columnMap = new HashMap<>();
		int numBookingPossible=0;
		
		int tempCount=3;
		boolean firstColBooked=false;
		boolean secColBooked=false;
		boolean thirdColBooked=false;
		
		columnMap.put('A', 0);
		columnMap.put('B', 1);
		columnMap.put('C', 2);
		columnMap.put('D', 3);
		columnMap.put('E', 4);
		columnMap.put('F', 5);
		columnMap.put('G', 6);
		columnMap.put('H', 7);
		columnMap.put('J', 8);
		columnMap.put('K', 9);
		
		/*for(int i=0;i<n;i++) {
			for(int j=0;j<10;j++) {
				seats[i][j]="UN";
			}
		}*/
		String[] seatsBooked = null;
		if(S!=null&&S.length()>0) {
			seatsBooked = S.split(" ");
			for(String seat:seatsBooked) {
				char c = seat.charAt(seat.length()-1);
				int col = columnMap.get(c);
				int row = Integer.valueOf(seat.substring(0,seat.length()-1));
				seats[row-1][col]="BK";
			}
		}
		
		for(int row=0;row<N;row++) {
			tempCount=3;
			firstColBooked=false;
			secColBooked=false;
			thirdColBooked=false;
			
			for(int col=0;col<10;col++) {
				String bookingToken = seats[row][col];
				if((col==0||col==1||col==3)&&"BK".equals(bookingToken)) {
					if(!firstColBooked) {
						firstColBooked=true;
						tempCount--;
					}
				}
				else if((col==4||col==5)&&"BK".equals(bookingToken)) {
					if(!secColBooked) {
						secColBooked=true;
						tempCount--;
					}
				}
				else if((col==7||col==8||col==9)&&"BK".equals(bookingToken)){
					if(!thirdColBooked) {
						thirdColBooked=true;
						tempCount--;
					}
				}
			}
			
			numBookingPossible=numBookingPossible+tempCount;
		}
		
		System.out.println("Number of bookings : "+numBookingPossible);
		
	}

}
