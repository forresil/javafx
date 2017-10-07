package application;



import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
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
		
		//File menu items
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out.println("Create a new File..."));
		fileMenu.getItems().add(newFile);
		
		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit..."));
		
		
		//Edit Menu
		Menu editMenu = new Menu("_Edit");
		editMenu.getItems().add(new MenuItem("Cut"));
		editMenu.getItems().add(new MenuItem("Copy"));		
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Paste some crap"));
		paste.setDisable(true);
		editMenu.getItems().add(paste);
		
		//Help Menu
		//(Declare CheckMenuItems)
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show line numbers");
		//(Implement Check or not Check Logic)
		showLines.setOnAction(e -> {
			if(showLines.isSelected())
				System.out.println("Program will now display line numbers");
			else 
				System.out.println("Hidding line numbers");
		});
		//(Implements Check by default)
		CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showLines, autoSave);
		
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);		
		
		//Layout
		layout = new BorderPane();		  
		layout.setTop(menuBar);
		
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();

	}

	
	
}




























