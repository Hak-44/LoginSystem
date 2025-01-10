package org.example.loginfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.TextFlow;

public class HomeController {

    static User user;

    @FXML
    public ImageView imageView;

    @FXML
    public TextFlow profileFlow;

    @FXML
    public Button exitBtn;

    @FXML
    public Label userName;
    public TextFlow prototypeFlow;


    @FXML
    private void onExitButtonClick() {
        userName.setText("");
    }



}
