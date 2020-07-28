package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CardGame {

    protected static CardGame cardGame;

    public void switchUI(String fileName, Label locator){
        try{
            Parent root = FXMLLoader.load(getClass().getResource(fileName));
            Stage stage = (Stage) locator.getScene().getWindow();
            Scene scene = new Scene(root, 1600, 900);
            stage.setScene(scene);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private Label pickGameLabel;

    @FXML
    private ImageView testImage;


    @FXML
    private void initialize() throws FileNotFoundException {
        //cardGame = new BlackJack();
        //testImage.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\1 Hearts.png")));
    }

    @FXML
    void pressedBlackJack(ActionEvent event){
        switchUI("BlackJack.fxml", pickGameLabel);
    }

    public CardGame(){
    }


    protected void dealCards(){}

    protected void displayHand() throws FileNotFoundException {}

}
