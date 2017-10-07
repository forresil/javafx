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
		
		window.setOnCloseRequest(e -> {				//Close program properly by clicking X on window
			e.consume();
			closeProgram();	
		});		
		
		button = new Button("Close Program");				//Close program driven by controls
		button.setOnAction(e -> closeProgram());
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();

	}	
	
	private void closeProgram(){
		boolean result = ConfirmBox.display("Confirmation", "Are you sure you want to exit?");
		if (result){
			System.out.println("File is saved!");
			window.close();
		}
	}
	
		
}