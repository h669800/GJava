package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class J3dato {
	
	public static boolean isValid (String s, int minl, int maxl, int maxV) {
		char[] characters = s.toCharArray();
		
		    for (int i = s.length() - 1; i != -1; i--) 
				if (Character.isDigit(s.toCharArray()[i]) == false) 
					return false;
		    
		   if (s.length() < minl || s.length() > maxl)
			   return false;
		   if (parseInt(s) < 1 || parseInt(s) > maxV)
			   return false;
		
		return true;
	}
	public static void main(String[] args) {
		
		// for (int i = 1; i == 1; i--) {
		// try {

		   String Day = showInputDialog("Example: 03 \n Enter the Day:");
	       while ( (isValid(Day, 1, 2, 31) == false) )
	            Day = showInputDialog("Example: 03 \n Error; enter the Day again: ");
		
		   String Month = showInputDialog("Example: 01 \n Enter the Month:");
	       while ( (isValid(Month, 1, 2, 12) == false))
	            Month = showInputDialog("Example: 01 \n Error; enter the Month again: ");
		
		   String Year = showInputDialog("Example: 2002 \n Enter the year:");
		   while ( ( isValid(Year, 1, 4, 9999) == false)) 
			   Year = showInputDialog("Example: 2002 \n Error; enter the Year again:");

		

		         showMessageDialog(null, Day + "." + Month + "." + Year);
		
		// } catch (Exception Feil) {
		// 	showMessageDialog(null, "Feil: Du har ikke skrevet inn ett valid tall. Prøv på nytt.");
		// 	i++;
		// }
		// }
	}
	
}
