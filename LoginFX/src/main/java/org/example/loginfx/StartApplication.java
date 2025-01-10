package org.example.loginfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {

    private FXMLLoader LoginLoader = new FXMLLoader(StartApplication.class.getResource("login-view.fxml"));
    private FXMLLoader HomeLoader = new FXMLLoader(StartApplication.class.getResource("home-view.fxml"));
    private FXMLLoader StartLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));

    private double defaultWidth = 350.0;
    private double defaultHeight = 500.0;

    static Stage mainStage;


    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        //fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene startScene = new Scene(StartLoader.load(), 400.0, 300);
        mainStage.setWidth(defaultWidth);
        mainStage.setHeight(defaultHeight);
        mainStage.setTitle("Hello!");
        mainStage.setScene(startScene);
        mainStage.show();
    }


    public static void main(String[] args) {
        launch();
    }

    public void SwitchToLoginWindow() throws IOException {
        //fxmlLoader = new FXMLLoader(StartApplication.class.getResource("login-view.fxml"));
        Scene loginScene = new Scene(LoginLoader.load(), 400.0, 300);
        mainStage.setTitle("Login");
        mainStage.setScene(loginScene);
        mainStage.show();
    }

    public void SwitchToHomeWindow() throws IOException {

        //fxmlLoader = new FXMLLoader(StartApplication.class.getResource("home-view.fxml"));
        Scene homeScene = new Scene(HomeLoader.load(), 400.0, 300);
        mainStage.setTitle("Home");
        mainStage.setScene(homeScene);
        mainStage.show();

    }

    public void SwitchBackToStartWindow() throws IOException {

        Scene startScene = new Scene(StartLoader.load(), 400.0, 300);
        mainStage.setTitle("Start");
        mainStage.setScene(startScene);
        mainStage.show();

    }
}