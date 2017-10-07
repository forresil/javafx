package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
	
	//Returns the StringProperty Object
	public final StringProperty firstNameProperty() {
		return this.firstName;
	}
	
	//Return firstName value (i.e. "Bucky")
	public final String getFirstName() {
		return this.firstNameProperty().get();
	}
	
	//Set firstName value
	public final void setFirstName(final String firstName) {
		this.firstNameProperty().set(firstName);
	}
	

	
}
