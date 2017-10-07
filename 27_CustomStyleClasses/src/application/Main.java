package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;



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

		//GridPane with 10px padding around edge
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		//Name label - constrains use (child, column, row)
		Label nameLabel = new Label("Username:");
		//nameLabel.setStyle("-fx-text-fill: #e8e8e8");			//INLINE STYLE DEFINITION!!
		nameLabel.setId("bold-label");							//SET ID
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name Input
		TextField nameInput = new TextField("forresil");
		GridPane.setConstraints(nameInput, 1, 0);
		
		//Password label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Password Input
		TextField passInput = new TextField();
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1, 1);
		
		//Login
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		//Set a new Style  									//SET NEW STYLE
		loginButton.setOnAction(e -> {
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});
		
		
		//Sign up
		Button signUpButton = new Button("Sign Up");
		signUpButton.getStyleClass().add("button-blue");
		GridPane.setConstraints(signUpButton, 1, 3);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);
		
		Scene scene = new Scene(grid, 300, 200);
															//ADD CSS STYLE SHEET
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		window.setScene(scene);
		window.show();

	}	
}
