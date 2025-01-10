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
    protected void onLoginButtonClick() {
        ValidateFields();

    }

    @FXML
    public void onBackButtonClick() throws IOException {
        SwitchBackToStartWindow();
    }

    private void ValidateFields() {
        String username = usernameField.getText();
        String password = passwordField.getText();




    }

}
