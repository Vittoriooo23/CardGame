package sample;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public Card getCard(int index){
        return hand.get(index);
    }

    public int getSum(){
        int sum = 0;
        for(int i = 0; i < hand.size(); i++)
            sum = sum + hand.get(i).getNum();
        return sum;
    }

    public int getSize(){
        return hand.size();
    }

    public void display(){
        for (Card x : hand) {
            System.out.println(x);
        }
    }
}
