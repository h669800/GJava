package Oppgåver;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class B5Akarakter {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {	
			int poengsum = parseInt(showInputDialog("Poengsum:"));
		    String karakter = "Ugyldig poengsum";

			if (poengsum <= 39 && poengsum >= 0)   karakter = "F";
			if (poengsum <= 49 && poengsum >= 40)  karakter = "E";
			if (poengsum <= 59 && poengsum >= 50)  karakter = "D";
			if (poengsum <= 79 && poengsum >= 60)  karakter = "C";
			if (poengsum <= 89 && poengsum >= 80)  karakter = "B";
			if (poengsum <= 100 && poengsum >= 90) karakter = "A";
			if ( karakter.equals("Ugyldig poengsum") ) i--;
			
		    showMessageDialog(null, "Karakter: " + karakter);
		}
	
	}

}
 