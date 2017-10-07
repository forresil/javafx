package application;

import javafx.scene.control.Button;

public class Controller  {

	public Button button;
	
	public void handleButtonClick(){
		System.out.println("run some code the user doesn't see");
		button.setText("Stop touching me!");
	}
}
