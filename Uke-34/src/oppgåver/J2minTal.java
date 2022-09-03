package oppgåver;

import java.util.StringTokenizer;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J2minTal {
	
	public static void main(String[] args) {
		String input = showInputDialog(
				"Dette programmet finner det minste tallet \n "
				+ "Eksempel: 1,4,3,8 = 1, eller 2,7 = 2 \n"
				+ " Skriv inn talene dine:");
		StringTokenizer st = new StringTokenizer(input, ",");

		for (int min = parseInt((String)st.nextElement()); st.countTokens() != 0;) {
			min = Math.min(min, parseInt((String)st.nextElement()));
			if (st.countTokens() == 0) 	 showMessageDialog(null, min);
		}
		
		
	}
	
}
