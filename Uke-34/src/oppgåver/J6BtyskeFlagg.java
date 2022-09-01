package oppgåver;

import easygraphics.*;
public class J6BtyskeFlagg extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Det Tyske flagget");
		
		setColor(0, 0, 0);
		fillRectangle(50, 50, 300, 70);
		setColor(221, 0, 0);
		fillRectangle(50, 115, 300, 70);
		setColor(225, 206, 0);
		fillRectangle(50, 180, 300, 70);
		setColor(0, 0, 0);
		drawRectangle(50, 50, 300, 200);
	}

}