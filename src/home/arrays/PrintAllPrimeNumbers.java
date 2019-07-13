package home.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author sony
 * 
 * Steps:
 * skip all even numbers, start iteration from 3
 * include 2 in the result at the beginning since its a prime number
 * All non prime numbers are divisible by at least one prime number coming before it. 
 * If its divisible, then its not prime else its a prime and include it in the list.
 *
 */

public class PrintAllPrimeNumbers {

	public static void main(String[] args) {
		int primeRange=1000000;
		List<Integer> result = getPrime(primeRange); 
		for(int num:result) {
			System.err.println(num+",");
		}
	}
	
	private static List<Integer> getPrime(int range) {
		List<Integer> result = new ArrayList<>();
		result.add(2);
		for(int i=3;i<=range;i+=2) {
			boolean isPrime=true;
			for(int j=0;j<result.size();j++) {
				if(i%result.get(j)==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				result.add(i);
			}
		}
		return result;
	}
	
}
