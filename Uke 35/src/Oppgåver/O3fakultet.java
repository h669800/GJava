package Oppgåver;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
   
public class O3fakultet {
	 
	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Skriv inn n:"));
		int fakultet = n;
		System.out.print(n + "! = " + n);
		
		do {
			fakultet--;
			n *= fakultet;
			System.out.print(" * " + fakultet);
			
		} while( fakultet != 1) ;
		
		System.out.print(" = " + n);
		
	}
	
}