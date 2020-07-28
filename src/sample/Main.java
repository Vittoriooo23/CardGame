package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("CardGame.fxml"));
        primaryStage.setTitle("Card Games");
        primaryStage.setScene(new Scene(root, 1600, 900));
        primaryStage.show();
        //test
    }


    public static void main(String[] args) {
        launch(args);

    }

}
