package oppgåver;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J2otherWay {

	public static void main(String[] args) {
		int input = parseInt(showInputDialog("How many numbers do you want to enter?"));
		
		if (input == 1) {
			String Number = showInputDialog("Enter your number");
			showMessageDialog(null, "The mininmum number is: " + Number);
			
		} else if (input <= 0) {
			System.exit(0);
			if (input != 1 && input ) {
		   for (int tal1 = parseInt(showInputDialog("Enter a number")); input != 1; input --) {
			   
			tal1 =  Math.min(tal1, parseInt(showInputDialog("Enter another number:")));
			   if (input == 2) {
				showMessageDialog(null, tal1);
				
			   }
		   }

     	}
	}

}