package org.example.loginfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class StartController extends StartApplication{
    @FXML
    private Label infoMessage;

    @FXML
    protected void onGoToLoginButtonClick() throws IOException {
        // go to log in scene
        infoMessage.setText("Going to Login");
        SwitchToLoginWindow();
    }


    @FXML
    public void onGoToSignUpClick() {
        infoMessage.setText("Coming soon, maybe.");
    }



}