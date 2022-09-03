package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class J3dato {

	public static void main(String[] args) {
		
		// for (int i = 1; i == 1; i--) {
		// try {
		   String Day = showInputDialog("Example: 03 \n Enter the Day:");
	       while ( (Character.isDigit(Day.toCharArray()[0]) == false || Character.isDigit(Day.toCharArray()[1]) == false) || (Day.length() < 1 || Day.length() > 2) || (parseInt(Day) < 1 || parseInt(Day) > 31) )
	            Day = showInputDialog("Example: 03 \n Enter the day: ");
		
		   String Month = showInputDialog("Example: 01 \n Enter the Month:");
	       while ( (Character.isDigit(Month.toCharArray()[0]) == false || Character.isDigit(Month.toCharArray()[1]) == false) || (Month.length() < 1 || Month.length() > 2) || (parseInt(Month) < 1 || parseInt(Month) > 12) )
	            Month = showInputDialog("Example: 01 \n Enter the Month: ");
		
		   String Year = showInputDialog("Example: 2002 \n Enter the year:");
		   while ( (Character.isDigit(Year.toCharArray()[0]) == false || Character.isDigit(Year.toCharArray()[1]) == false || Character.isDigit(Year.toCharArray()[3]) == false ||  Character.isDigit(Year.toCharArray()[3]) == false ) || Year.length() != 4) Year = showInputDialog("Years must have 4 numbers, example: 2002.");

		

		         showMessageDialog(null, Day + "." + Month + "." + Year);
		
		// } catch (Exception Feil) {
			
		// 	showMessageDialog(null, "Feil: Du har ikke skrevet inn ett valid tall. Prøv på nytt.");
		// 	i++;
		// }
		// }
		
		
		
	}

}
