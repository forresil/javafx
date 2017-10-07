package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;



public class Main extends Application {
	
	Stage window;
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title of the Window");

		//Form
		TextField nameInput = new TextField();
		
		button = new Button("Click me");
		button.setOnAction(e -> isInt(nameInput, nameInput.getText()));
		
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(nameInput, button);
		  
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();

	}
	
	
	private boolean isInt(TextField input, String message){
		try{
			int age = Integer.parseInt(message);
			System.out.println("User is:" + age);
			return true;
		}catch(NumberFormatException e){
			System.out.println("Error:"+ message + "is not a number");
			return false;
		}
	}
	
}



























