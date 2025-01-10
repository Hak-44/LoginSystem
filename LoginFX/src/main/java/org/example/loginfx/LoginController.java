package org.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends StartApplication{

    @FXML
    public TextField usernameField;
    @FXML
    public PasswordField passwordField;

    @FXML
    private Label loginPortal;

    @FXML
    private Button loginBtn;

    @FXML
    private Button backBtn;


    @FXML
    protected void onLoginButtonClick() throws IOException {
        ValidateFields();

    }

    @FXML
    public void onBackButtonClick() throws IOException {
        SwitchBackToStartWindow();
    }

    private void ValidateFields() throws IOException {
        String usernameInput = usernameField.getText();
        String passwordInput = passwordField.getText();

        if (usernameInput.isBlank()){
            usernameField.setStyle("-fx-background-color: #f1eda0");

        }else{
            ValidatePassword(usernameInput, passwordInput);
        }

    }

    private void ValidatePassword(String usernameInput, String passwordInput) throws IOException {
        boolean hasFoundMatch = false;  // this boolean is used to check if the passing is valid

        for(int i = 0; i < AllAcounts.nameArray.length; i++){

            // .tolowerCase converts both retrieved strings from the class and user inputs to lowercase, which prevents case sensitivity
            if(AllAcounts.nameArray[i].getUsername().toLowerCase().equals(usernameInput.toLowerCase()) && AllAcounts.nameArray[i].getPassword().equals(passwordInput)){
                hasFoundMatch = true;   // switches to true when a match is found
                User user = AllAcounts.nameArray[i];   // creates a class that will reference the matching username in the database.
                System.out.println("\n[SYSTEM] - Welcome, "+ user.getUsername() + ".");
                usernameField.setStyle("-fx-background-color: #a8f1a0");
                passwordField.setStyle("-fx-background-color: #a5f1a0");
                SwitchToHomeWindow(user);
            }

        }
        // if the boolean still reads false, it will send this "error", message
        if(!hasFoundMatch){
            usernameField.setStyle("-fx-background-color: #f1a0a0");
            passwordField.setStyle("-fx-background-color: #f1a0a0");
        }
    }

}
