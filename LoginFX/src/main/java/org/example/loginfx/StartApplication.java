package org.example.loginfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Text;
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

    // since this is where the program starts, it's best to initialise and run functions here before launching
    public static void main(String[] args) {
        AllAcounts.CreateSampleLogins();    // generating the classes
        launch();
    }

    public void SwitchToLoginWindow() throws IOException {
        //fxmlLoader = new FXMLLoader(StartApplication.class.getResource("login-view.fxml"));
        Scene loginScene = new Scene(LoginLoader.load(), 400.0, 300);
        mainStage.setTitle("Login");
        mainStage.setScene(loginScene);
        mainStage.show();
    }

    public void SwitchToHomeWindow(User user) throws IOException {

        //fxmlLoader = new FXMLLoader(StartApplication.class.getResource("home-view.fxml"));
        Scene homeScene = new Scene(HomeLoader.load(), 400.0, 300);



        SetupUserDetails(user);
        mainStage.setTitle("Home");
        mainStage.setScene(homeScene);
        mainStage.show();

    }

    private void SetupUserDetails(User user) {
        HomeController homeCon = HomeLoader.getController();
        homeCon.userName.setText(user.getName());

        Text text = new Text("UserID: "+user.getID());
        homeCon.profileFlow.getChildren().add(text);

        Text text2 = new Text("\n\nBio: "+user.getBio());
        homeCon.profileFlow.getChildren().add(text2);

        Text text3 = new Text("\n\nAccount Privileges: "+user.getType());
        homeCon.profileFlow.getChildren().add(text3);

        //homeCon.prototypeFlow.getChildren().add(text);

    }


    public void SwitchBackToStartWindow() throws IOException {

        Scene startScene = new Scene(StartLoader.load(), 400.0, 300);
        mainStage.setTitle("Start");
        mainStage.setScene(startScene);
        mainStage.show();

    }
}