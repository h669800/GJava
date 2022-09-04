package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class dato {

	public static void main(String[] args) {


		String Day = zeroedUserInput("Day", 1, 2, 31);
		String Month = zeroedUserInput("Month", 1, 2, 12);
		String Year = zeroedUserInput("Year", 1, 4, 9999);
		// (text, minLength, maxLength, maxValue)
			
		   showMessageDialog(null, "Date: " + Day + "." + Month + "." + Year);
		
	}
	
	public static String zeroedUserInput (String text, int minLength, int maxLength, int maxValue) {
		
		String userInput;
		do userInput = showInputDialog("Enter the " + text + ": ");
	    while ( !isValid(userInput, minLength, maxLength, maxValue) ); 
		// Asks the user for the value until it is Valid
		   
		while ( maxLength != userInput.length() )  userInput = "0" + userInput; 
		// Add a zero behind the String/number (ex: 1 becomes 0001 if the maxlength is 4)
		return userInput;
	}
	
	public static boolean isValid (String s, int minLength, int maxLength, int maxValue) {
		
		
		   if (s == null) System.exit(0);
		   // exits program if you click cancel in the window
		   for (int i = s.length() - 1; i != -1; i--) {
		 	  // Run once for each character in string
        	   if ( !Character.isDigit( s.charAt(i) ) ) return false; 
		   } // return false if string contains letters
		     
		   try {
			   
		      int value = parseInt(s);
		      if (value < 1 || value > maxValue)  return false;
		      // If too high value, return false.
		      if (s.length() < minLength || s.length() > maxLength) return false; 
		      // if too many/few characters, return false.
		      
		   } catch (Exception e) {
					return false;
		   } // return false if invalid elements are entered.
		   
	return true; // if none of the if statements initiate
	}
	
}
