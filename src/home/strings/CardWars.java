package home.strings;

public class CardWars {

	public static void main(String[] args) {
		//char s = 'T'; //10,20,26,19,29
		
		
		System.out.println(solution("T586QK","JJ653K")); //65,75,81,74,84

	}
	
	public static int solution(String A, String B) {
        char[] aDecks = A.toCharArray();
        char[] bDecks = B.toCharArray();
        int decks = aDecks.length;
        int numWins = 0;
        
        for(int i=0;i<decks;i++) {
        	if(isHigher(aDecks[i], bDecks[i])) {
        		numWins++;
        	}
        }
        
		return numWins;
    }
	
	private static boolean isHigher(char a,char b) {
		int aVal = Character.getNumericValue(a);
		int bVal = Character.getNumericValue(b);
		boolean res = false;
		
		if(aVal<10 && bVal<10 && aVal>bVal) {
			res = true;
		}
		
		else if (bVal<10 && aVal>bVal) {
			res = true;
		}
		
		else if (aVal==19 && bVal==29) {
				res = true;
		}
		
		else if(aVal==29 && bVal<10) {
			res= true;
		}
		
		else if(bVal==19 && (aVal>=10 && aVal!=29)) {
			res = true;
		}
		
		else if(bVal==29 && (aVal>=10 && aVal<29)) {
			res = true;
		}
		
		else {
			if(bVal>aVal && aVal>=10) {
				res = true;
			}
		}
		
		return res;
		
	}

}
