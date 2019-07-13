package home.strings;

/**
 * 
 * @author sony
 * 
 * Hello World
 * 
 *   e              l
 * H   l   o  W   r   d
 *       l      o
 *
 */
public class SinusoidalString {

	public static void main(String[] args) {
		String s = "Soubhik";
		int i=1;
		StringBuffer sb=new StringBuffer();
		
		while(i<s.length()) {
			sb.append(s.charAt(i));
			i+=4;
		}
		
		i=0;
		
		while(i<s.length()) {
			sb.append(s.charAt(i));
			i+=2;
		}
		
		i=3;
		
		while(i<s.length()) {
			sb.append(s.charAt(i));
			i+=4;
		}
		
		System.out.println("Sinusoidal String of "+s+" is "+sb.toString());
	}

}
