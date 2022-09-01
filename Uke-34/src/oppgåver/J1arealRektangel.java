package oppgåver;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class J1arealRektangel {

	public static void main(String[] args) {
		
		int Lengde = parseInt(showInputDialog("Hva er Lengden?"));
		int Bredde = parseInt(showInputDialog("Hva er Bredden?"));
		int Areal = Lengde * Bredde;
		
		showMessageDialog(null, "Arealet er:" + Areal);

	}
}
