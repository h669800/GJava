package oppgåver;
import easygraphics.*;
import javax.swing.JOptionPane;

public class J6CprosentvisFlagg extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	public void run() {
		 try {
			 
		int Prosent = Integer.parseInt(JOptionPane.showInputDialog("Eksempel: 100 \n Skriv inn den prosentvise størrelsen:"));
		makeWindow("Det Tyske flagget");
		
		setColor(0, 0, 0);
		fillRectangle(50 * Prosent / 100, 50 * Prosent / 100, 300 * Prosent / 100, 70 * Prosent / 100);
		setColor(221, 0, 0);
		fillRectangle(50 * Prosent / 100, 115 * Prosent / 100, 300 * Prosent / 100, 70 * Prosent / 100);
		setColor(225, 206, 0);
		fillRectangle(50 * Prosent / 100, 180 * Prosent / 100, 300 * Prosent / 100, 70 * Prosent / 100);
		setColor(0, 0, 0);
		drawRectangle(50 * Prosent / 100, 50 * Prosent / 100, 300 * Prosent / 100, 200 * Prosent / 100);
		
		 } catch (Exception e) {
			 JOptionPane.showMessageDialog(null, "Du skrev ikke inn ett valid nummer.");
		 }
	} 

}