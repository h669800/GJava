package oppgåver;

import easygraphics.*;
public class J6AfranskeflaggA extends EasyGraphics {

	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Det franske flagget");
		
		setColor(0, 0, 255);
		fillRectangle(50, 50, 100, 200);
		setColor(255, 0, 0);
		fillRectangle(250, 50, 100, 200);
		setColor(0, 0, 0);
		drawRectangle(50, 50, 300, 200);
	}

}
