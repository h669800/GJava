package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J4sekund_kalkulator {

	public static void main(String[] args) {
		
	try {
			
		int Input = parseInt(showInputDialog(
				"Eksempel 3600 \n "
				+ "Skriv inn antall sekunder: "));
		
		int Timer = Input/3600;
		int Minutt = (Input%3600)/60;
		int Sekund = (Input%3600)%60;
		
		showMessageDialog(null,
		Input + "s tilsvarer: "
		+ Timer + "t, "
		+ Minutt + "m, "
		+ Sekund + "s.");
		
	} catch (Exception e) {
		showMessageDialog(null, "Du skrev ikke inn et valid nummer.");
	}

	}

}
