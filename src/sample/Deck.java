package sample;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    private Random rand;

    public Deck() throws FileNotFoundException {
        deck = new ArrayList<Card>(52);
        rand = new Random();
        createDeck();
        Collections.shuffle(deck);
    }

    private void createDeck() throws FileNotFoundException {
        Card card = new Card();

        for(int i = 1; i < 14; i++){
            card.setSuit("Hearts");
            card.setNum(i);
            card.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\" + i + " Hearts.png")));
            deck.add(card);
            card = new Card();
        }
        for(int i = 1; i < 14; i++){
            card.setSuit("Clubs");
            card.setNum(i);
            card.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\" + i + " Clubs.png")));
            deck.add(card);
            card = new Card();
        }
        for(int i = 1; i < 14; i++){
            card.setSuit("Spades");
            card.setNum(i);
            card.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\" + i + " Spades.png")));
            deck.add(card);
            card = new Card();
        }
        for(int i = 1; i < 14; i++) {
            card.setSuit("Diamonds");
            card.setNum(i);
            card.setImage(new Image(new FileInputStream("C:\\Users\\russo\\IdeaProjects\\CardGame\\src\\Images\\" + i + " Diamonds.png")));
            deck.add(card);
            card = new Card();
        }
    }

    public Card getRandomCard(){
        int randomNum = rand.nextInt(deck.size());
        Card card = new Card();
        card = deck.get(randomNum);
        deck.remove(randomNum);
        return card;
    }

    public void resetDeck() throws FileNotFoundException {
        deck.clear();
        createDeck();
    }

    public void display(){
        for (Card x : deck)
            System.out.println(x);
    }
}
