package application;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	Stage window;
	BorderPane layout;

	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("Menu Example");

		//File Menu
		Menu fileMenu = new Menu("File");
		
		//Menu items
		fileMenu.getItems().add(new MenuItem("New Project..."));
		fileMenu.getItems().add(new MenuItem("New Module..."));
		fileMenu.getItems().add(new MenuItem("Import Project..."));
		
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu);
		
		
		//Layout
		layout = new BorderPane();		  
		layout.setTop(menuBar);
		
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();

	}

	
	
}



























