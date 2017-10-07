package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Title of the Window");
		
		Person bucky = new Person();
		bucky.firstNameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println("Name changed to " + newValue);
			System.out.println("firstNameProperty(): "+bucky.firstNameProperty());
			System.out.println("getFirstName(): " + bucky.getFirstName());
		});
		
		button = new Button();
		button.setText("Submit");
		button.setOnAction(e -> bucky.setFirstName("Porky"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();

	}	
}
