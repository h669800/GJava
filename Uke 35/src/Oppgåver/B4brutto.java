package Oppgåver;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class B4brutto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inntekt = parseInt(showInputDialog("Hva er inntekten din?"));
		 double skatt = 1;

		    if (inntekt <= 164100)                      skatt = 0;
			if (inntekt >= 164101 && inntekt <= 230950) skatt = 0.94/100;
			if (inntekt >= 230951 && inntekt <= 580650) skatt = 2.41/100;
			if (inntekt >= 580651 && inntekt <= 934050) skatt = 11.52/100;
			if (inntekt >= 934051)                      skatt = 14.52/100;

	        showMessageDialog(null, "Du må betale: " + inntekt * skatt + " kr i skatt.");	
	}

}
