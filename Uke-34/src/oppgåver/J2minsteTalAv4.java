package oppgåver;

import java.util.StringTokenizer;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J2minsteTalAv4 {

	public static void main(String[] args) {
		String input = showInputDialog("Dette programmet finner det minste tallet \n "
				+ "Eksempel: 1/4/3/8 = 1, eller 2/7 = 2 \n"
				+ " Skriv inn 2 til 4 tal: <tal1>/<tal2>/<tal3>/<tal4>");
		
		StringTokenizer st = new StringTokenizer(input, "/,|");
		

				if (st.countTokens() > 1) {
				int tal1 = parseInt((String)st.nextElement());
				   
				   if (st.countTokens() > 0) {
				   int tal2 = parseInt((String)st.nextElement());
				   int min1 = Math.min(tal1, tal2);
				   
				      if (st.countTokens() > 0) {
				      int tal3 = parseInt((String)st.nextElement());
				      int min2 = Math.min(tal3, min1);
				         
				         if (st.countTokens() > 0) {
				         int tal4 = parseInt((String)st.nextElement());
				         int min3 = Math.min(tal4, min2);
				         
				            if (st.countTokens() > 0) {
				            	showMessageDialog(null, "Maksimum antall av tal er 4!");
				            } else {
				            	showMessageDialog(null, "Det minste taller er: " + min3);
				            }
				         } else {
					    	  showMessageDialog(null, "Det minste tallet er: " + min2);
					      }
				      } else {
				    	  showMessageDialog(null, "Det minste tallet er: " + min1);
				      }
				   }
				} else {
					System.exit(0);
				}
				
	}

}
