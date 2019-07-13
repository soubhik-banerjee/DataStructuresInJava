package home.strings;

import java.util.Arrays;

public class DigitalClock {

	public static void main(String[] args) {
		
		String sol = solution(0,0,0,7,8,9);
		System.out.println(sol);
	}
	
	public static String solution(int A, int B, int C, int D, int E, int F) {
	   String earliestTime="";
       int[]time= {A,B,C,D,E,F};
       Arrays.sort(time);
       int hour = time[0]*10+time[1];
       int min = time[2]*10+time[3];
       int sec=time[4]*10+time[5];
       
       if(hour>=24) {
    	   earliestTime = "NOT POSSIBLE";
       }
       
       else if(min>=60) {
    	   earliestTime = "NOT POSSIBLE"; 
       }
       
       else if(sec>=60) {
    	   earliestTime = "NOT POSSIBLE"; 
       }
       
       else {
    	   earliestTime = ""+(hour==0?"00":hour)+":"+(min==0?"00":min)+":"+(sec==0?"00":sec); 
       }
       
	return earliestTime;
    }

}
