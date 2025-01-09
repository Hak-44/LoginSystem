package org.example.loginfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {

    private Scene LoginScene;
    private Scene HomeScene;
    static Stage mainStage;
    static FXMLLoader fxmlLoader;


    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        fxmlLoader = new FXMLLoader(StartApplication.class.getResource("start-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        InitScenes();
        mainStage.setTitle("Hello!");
        mainStage.setScene(scene);
        mainStage.show();
    }

    private void InitScenes() throws IOException {



    }

    public static void main(String[] args) {
        launch();
    }

    public void SwitchToLoginWindow() throws IOException {
        mainStage.hide();
        fxmlLoader = new FXMLLoader(StartApplication.class.getResource("login-view.fxml"));
        LoginScene = new Scene(fxmlLoader.load(), 320, 240);
        mainStage.setTitle("Login");
        mainStage.setScene(LoginScene);
        mainStage.show();
    }

    public void SwitchToHomeWindow() throws IOException {
        mainStage.hide();
        fxmlLoader = new FXMLLoader(StartApplication.class.getResource("home-view.fxml"));
        HomeScene = new Scene(fxmlLoader.load(), 320, 240);
        mainStage.setTitle("Login");
        mainStage.setScene(HomeScene);
        mainStage.show();
    }
}