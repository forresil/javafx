package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application implements EventHandler<ActionEvent> {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Title of the Window");
		
		button = new Button();
		button.setText("Click me");
		button.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
	
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == button){
			System.out.println("Button clicked");	
		}
		
//		if(event.getSource() == button2){
//			System.out.println("Button 2  clicked");	
//		}
		
	}	
	
	
}
