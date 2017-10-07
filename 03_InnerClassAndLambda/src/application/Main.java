package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application{									//Don't need any more to implements EventHandler<Event>
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Title of the Window");
		
		button = new Button();
		button.setText("Click me");
//		button.setOnAction(this);
		button.setOnAction(new EventHandler<ActionEvent>() {			//Anonymous Method

			@Override
			public void handle(ActionEvent event) {
				System.out.println("I am an anonymous inner class");
			}
			
		});		
		button.setOnMousePressed(e -> System.out.println("Mouse was pressed on button"));   //Event as Lambda expression
		button.setOnMouseEntered(e -> {														//Multiple lines in Lambda expression
			System.out.println("Mouse entered to button area");
			System.out.println("--> second line of mouse entered to button area");
		});
			
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
	
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

//	@Override
//	public void handle(ActionEvent event) {
//		if(event.getSource() == button){
//			System.out.println("Button clicked");	
//		}
//		
////		if(event.getSource() == button2){
////			System.out.println("Button 2  clicked");	
////		}
//		
//	}	
	
	
}
