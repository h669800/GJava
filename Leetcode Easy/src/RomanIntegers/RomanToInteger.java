package RomanIntegers;

class RomanToInteger {
    public  int romanToInt(String s) {
    	String Rom = s + "."; // i have + "." so i can use (i+1) in if statements
    	int numbers = 0; // sets the base value that the loop adds to.
        
        
    for(int i = 0; i < Rom.length(); i++) {
    	    
    	    if (Rom.charAt(i) == 'I')
    	       numbers = convert(Rom, numbers, i, 1, 'Q', 'V', 4, 'X', 9);
                
    	    if (Rom.charAt(i) == 'V')
    	       numbers = convert(Rom, numbers, i, 5, 'I', 'Q', 0, 'Q', 0);
                
    	    if (Rom.charAt(i) == 'X')
    	       numbers = convert(Rom, numbers, i, 10, 'I', 'L', 40, 'C', 90);
                
    	    if (Rom.charAt(i) == 'L')
    	       numbers = convert(Rom, numbers, i, 50, 'X', 'Q', 0, 'Q', 0);
                
    	    if (Rom.charAt(i) == 'C')
    	       numbers = convert(Rom, numbers, i, 100, 'X', 'D', 400, 'M', 900);
                
    	    if (Rom.charAt(i) == 'D')
    	       numbers = convert(Rom, numbers, i, 500, 'C', 'Q', 0, 'Q', 0);
                
    	    if (Rom.charAt(i) == 'M')
    	       numbers = convert(Rom, numbers, i, 1000, 'C', 'Q', 0, 'Q', 0);
    	         
    }
    	  return numbers;
    }
    
    	    
    	    public static int convert(String Rom, int numbers, int i, int addregular, char LeftNum, char RightNum1, int addL, char RightNum2, int addL2 ) {
    	    	
    	      
    	        	if (i > 0 && Rom.charAt(i-1) == LeftNum ) 
    	        		numbers += 0; 
    	                
    	        	else if (i < Rom.length() && Rom.charAt(i+1) == RightNum1) 
    	        		numbers += addL; 
    	                
    	        	else if (i < Rom.length() && Rom.charAt(i+1) == RightNum2) 
    	        		numbers += addL2; 
    	                
    	        	else 
    	        		numbers += addregular; 
    	      
    	return numbers; // at end
    }
}
