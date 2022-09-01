package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J3dato {

	public static void main(String[] args) {
		try {
			int Dag = parseInt(showInputDialog("Eksempel: 03 \n Skriv inn Dagen:"));
			int Måned = parseInt(showInputDialog("Eksempel: 11 \n Skriv inn Måneden:"));
			int År = parseInt(showInputDialog("Eksempel: 2002 \n Skriv inn Årstallet:"));
			
			showMessageDialog(null, "Du har valgt Datoen: " + Dag + "." + Måned + "." + År);
			
		} catch (Exception e) {
			showMessageDialog(null, "You did not type in a valid date.");
		}

	}

}
