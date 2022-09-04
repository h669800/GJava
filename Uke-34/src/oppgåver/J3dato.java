package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class dato {
	
	public static boolean isValid (String s, int minLength, int maxLength, int maxValue) {


		      for (int i = s.length() - 1; i != -1; i--) {
		    	  // Run once for each character in string
				   if ( Character.isDigit( s.toCharArray()[i] ) == false ) return false; 
		      } // return false if string contains numbers
		      
		   if (parseInt(s) < 1 || parseInt(s) > maxValue)  return false;
		   // If too high value, return false.
		   if (s.length() < minLength || s.length() > maxLength) return false; 
		   // if too many/few characters, return false.
		   
	     return true; // if none of the if statements initiate
	}
	
	public static String zeroedUserInput (String[] st, int minLength, int maxLength, int maxValue) {
		
		do st[1] = showInputDialog("Enter the " + st[0] + ": ");
	        while ( isValid(st[1], minLength, maxLength, maxValue) == false ); 
		// Asks the user to input the Day/Month/Year until isValid == true.
		
		while (maxLength != st[1].length())     st[1] = "0" + st[1]; 
		// Add a zero behind the String/number (ex: 1 becomes 0001 if the maxlength is 4)
		return st[1];
	}
	
	public static void main(String[] args) {
		
		String[] Day = {"Day", "userInput"};
		String[] Month = {"Month", "userInput"};
		String[] Year = {"Year", "userInput"};
		
		Day[1] = zeroedUserInput(Day, 1, 2, 31);
		Month[1] = zeroedUserInput(Month, 1, 2, 12);
	        Year[1] = zeroedUserInput(Year, 1, 4, 9999);
			
		   
		         showMessageDialog(null, "Date: " + Day[1] + "." + Month[1] + "." + Year[1]);
		
	}
	
}
