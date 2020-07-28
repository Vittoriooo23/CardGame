package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlackJack extends CardGame{

    @FXML
    private Label productionLabel;
    @FXML
    private ImageView handCard1;
    @FXML
    private ImageView dealerCard1;
    private Deck deck;
    private Hand hand;
    private Hand dealer;
    private Scanner s;
    private String path = "C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\";

    @FXML
    private void initialize() throws FileNotFoundException {
        //dealerCard1.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\1 Hearts.png")));
        cardGame = new BlackJack();
        dealerCard1.setImage(deck.getRandomCard().getImage());
    }

    @FXML
    void pressedDealCards(ActionEvent event) throws FileNotFoundException {
        cardGame.dealCards();
        cardGame.displayHand();
        //cardGame.displayHand();
        ((BlackJack)cardGame).replaceValuesForBJ();
    }


    public BlackJack() throws FileNotFoundException {
        deck = new Deck();
        hand = new Hand();
        dealer = new Hand();
        s = new Scanner(System.in);
    }

    public void Play() throws FileNotFoundException {
        dealCards();
        displayHand();
        if(checkBJ()){
            return;
        }
        hitOrStay();


    }

    protected void dealCards(){
        for(int i = 0; i < 2; i++){     //deals out 2 cards
            hand.addCard(deck.getRandomCard());
            dealer.addCard(deck.getRandomCard());
        }
    }
    @FXML
    public void displayHand() throws FileNotFoundException {
        //hand.display();
        dealerCard1.setImage(hand.getCard(0).getImage());
    }

    private void hitOrStay(){
        System.out.println("1 for HIT or 2 for STAY");

        int input = s.nextInt();

        while(input != 1 || input != 2) {
            System.out.println("Invalid Input, Try Again\n1 for HIT or 2 for STAY");
            input = s.nextInt();
        }

        if(input == 1){
            hand.addCard(deck.getRandomCard());
            replaceValuesForBJ();
        }
        else{

        }
    }

    private void replaceValuesForBJ(){
        for(int i = 0; i < hand.getSize(); i++) {
            if (hand.getCard(i).getNum() == 11 || hand.getCard(i).getNum() == 12 || hand.getCard(i).getNum() == 13)  //sets the values for Jack, Queen, King to 10 for player hand
                hand.getCard(i).setNum(10);
        }
        for(int i = 0; i < dealer.getSize(); i++) {
            if (dealer.getCard(i).getNum() == 11 || dealer.getCard(i).getNum() == 12 || dealer.getCard(i).getNum() == 13)  ////sets the values for Jack, Queen, King to 10 for dealer
                dealer.getCard(i).setNum(10);
        }
    }

    private boolean checkBJ(){
        if(hand.getSum() == 21){
            System.out.println("\t\tYOU WON!");
            return true;
        }
        return false;
    }

    private boolean checkBust(){
        if(hand.getSum() > 21){
            System.out.println("\t\tYOU LOSE!");
            return true;
        }
        return false;
    }

    private void finishDealer(){

    }





}
