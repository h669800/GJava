package oppgaaver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class B2 {

	public static void main(String[] args) {

		int bredde = lesInnTall("Bredde: ");

		int hoyde = lesInnTall("Høyde: ");

		int a = areal(bredde,hoyde);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}

	private static int lesInnTall(String message) {
		String x;
		do x = showInputDialog(message);
	    while ( !isValid(x) ); 

		return parseInt(x);
	}
	
	private static boolean isValid(String input) {
		
		if (input == null) System.exit(0);
		
		   for (int i = input.length() - 1; i != -1; i--) {
			 	  // Run once for each character in string
	        	   if ( !Character.isDigit( input.charAt(i) ) ) return false; 
			   } // return false if string contains letters
		   
		   if (parseInt(input) < 0) return false;
		return true;
	}
}
