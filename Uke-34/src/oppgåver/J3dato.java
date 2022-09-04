package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class J3dato {
		public static boolean isValid (String s, int minLength, int maxLength, int maxValue) {
		char[] s_characters = s.toCharArray(); // create an array of each character in the string s.

		   for ( int i = s.length() - 1; i != -1; i-- ) { // The for loop runs once for each character in the string. (ex: if string is "Hello", it runs 5 times.)
		      if ( Character.isDigit(  s_characters[i]  ) == false ) return false; // If any character in the string is not a number, return false. (String Hello12 returns false)
		   }
		   if (parseInt(s) < 1 || parseInt(s) > maxValue)  return false;// If too high value, return false. (ex: The 38th day of the month = false)
		   if (s.length() < minLength || s.length() > maxLength) return false; // if too many/few characters, return false. (ex: The 114th month = false)
		   
	     return true; // if none of the if statements initiate, return isValid(String, minLength, maxLength, maxValue) = true.
	}
	
	public static String zeroes (String st, int maxLength) {
		
		while (maxLength != st.length())    st = "0" + st; // Add a zero behind the String/number (ex: 1 becomes 0001 if the maxlength is 4)
		return st; // returns the string, so zeroes(String, maxLength) = st.
	}
	public static void main(String[] args) {
		
		String Day;
		String Month;
		String Year;
		// Declares the String's because we cannot do it in the loops below.

		   do Day = showInputDialog("Example: 03 \n Enter the Day:");
	       while ( isValid(Day, 1, 2, 31) == false ); // isValid (String st = Day; minLength = 1; maxLength = 2; maxValue = 31)
	            
		   do Month = showInputDialog("Example: 01 \n Enter the Month:");
	       while ( isValid(Month, 1, 2, 12) == false ); // isValid (String st = Month; minLength = 1; maxLength = 2; maxValue = 12)
	            
		   do Year = showInputDialog("Example: 2002 \n Enter the year:");
		   while ( isValid(Year, 1, 4, 9999) == false ); // isValid (String st = Year; minLength = 1; maxLength = 4; maxValue = 9999)
		   // The while loop makes you enter the number until you enter a valid number or exit the program.
		   
		   
		   Day = zeroes(Day, 2);
		   Month = zeroes(Month, 2);
		   Year = zeroes(Year, 4);
			// Adds zeroes behind the number. (ex: Year 115 = 0115, to match 4 characters.)
		   
		         showMessageDialog(null, "Date: " + Day + "." + Month + "." + Year);
		
	}
	
}
