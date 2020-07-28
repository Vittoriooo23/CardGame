package sample;

import javafx.scene.image.Image;

import java.io.FileInputStream;

public class Card {
    private String suit;
    private int num;
    private Image image;
    //private boolean alreadyInPlay = false;


    public Card(){

    }

    public Card(String suit, int num) {
        this.suit = suit;
        this.num = num;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", num=" + num +
                '}';
    }

    /*
    public void setAlreadyInPlay(boolean alreadyInPlay) {
        this.alreadyInPlay = alreadyInPlay;
    }
*/
}
