package RomanIntegers;

import java.util.HashMap;

public class HashmapExample {
	public static void main(String[] args) {
		
		System.out.println(romanToInt("MCM"));
		System.out.println("IV".charAt(1));
	}
	  public static int romanToInt(String s) {
		s = s + ".";
		int num = 0;
		HashMap<Character, Integer> table = new HashMap<Character, Integer>();
		table.put('I',1);
		table.put('V',5);
		table.put('X',10);
		table.put('L',50);
		table.put('C',100);
		table.put('D',500);
		table.put('M',1000);
		     
		    for(int i = 0; i < s.length(); i++) {
		    	if (s.charAt(i) == '.') return num;
		    	if (table.get(s.charAt(i+1)) > table.get(s.charAt(i))) {
		        num += table.get(s.charAt(i+1)) - 1;
		    	i++;
		    	} else 
		    		num += table.get(s.charAt(i));
		    }
		    
	return num;
		  }

}
